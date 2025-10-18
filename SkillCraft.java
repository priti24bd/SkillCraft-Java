import java.util.*;

public class SkillCraft {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> hardSkills = Arrays.asList("java", "python", "arduino", "robotics", "machine learning", "excel", "html", "css");
        List<String> softSkills = Arrays.asList("leadership", "teamwork", "communication", "creativity", "painting", "singing", "writing");

        System.out.println("🎨 Welcome to SkillCraft!");
        System.out.println("Type your skills one by one (type 'done' to finish):");

        while (true) {
            System.out.print("> ");
            String skill = scanner.nextLine().trim().toLowerCase();

            if (skill.equals("done")) break;

            if (hardSkills.contains(skill)) {
                System.out.println("💻 " + capitalize(skill) + " - That's a Hard Skill! Keep mastering it!\n");
            } else if (softSkills.contains(skill)) {
                System.out.println("🌸 " + capitalize(skill) + " - That's a Soft Skill! It shows your personality!\n");
            } else {
                System.out.println("✨ " + capitalize(skill) + " - Unique skill! Keep shining!\n");
            }
        }

        System.out.println("🌟 SkillCraft session ended. Remember: Skill is everything!");
        scanner.close();
    }

    private static String capitalize(String word) {
        if (word == null || word.isEmpty()) return word;
        return word.substring(0, 1).toUpperCase() + word.substring(1);
    }
}
