package introconstructors;

public class TaskMain {
    public static void main(String[] args) {
        Task task = new Task("Java backend", "This course is for beginners");
        System.out.println("Title :" + task.getTitle());
        System.out.println("Description :" + task.getDescription());
        task.start();
        System.out.println("StartDateTime :" + task.getStartDateTime());
        task.setDuration(900);
        System.out.println("Duration :" + task.getDuration());
    }
}
