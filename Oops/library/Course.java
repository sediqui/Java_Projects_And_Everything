public class Course {
  static int maxCapacity = 100;
  String studentName;
  int enrollment;
  String[] enrolledStudents = new String[maxCapacity];
  static void setMaxCapacity(int capacity) {
    maxCapacity = capacity;
  }
  public void enrollStudent(String studentName) {
    if(enrollment < maxCapacity) {
      enrolledStudents[enrollment] = studentName;
      enrollment++;
      System.out.println(studentName + " has been enrolled in the course.");
    } else {
      System.out.println("Course is full. Cannot enroll " + studentName);
    }
  }

  public void unenrollStudent(String studentName) {
    for(int i = 0; i < enrollment; i++) {
      if(enrolledStudents[i].equals(studentName)) {
        for(int j = i; j < enrollment - 1; j++) {
          enrolledStudents[j] = enrolledStudents[j + 1];
        }
        enrolledStudents[enrollment - 1] = null;
        enrollment--;
        System.out.println(studentName + " has been unenrolled from the course.");
        return;
      }
    }
    System.out.println(studentName + " is not enrolled in the course.");
  }

  public static void main(String[] args) {
    Course course = new Course();
    course.enrollStudent("Alice");
    course.enrollStudent("Bob");
    course.unenrollStudent("Alice");
    course.unenrollStudent("Charlie");
  }

}
