import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        Map<String, List<String>> members = new HashMap<>();
        Map<String, String> teams = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String teamName = sc.next();
            int memberNum = sc.nextInt();

            List<String> memberList = new ArrayList<>();
            for (int j = 0; j < memberNum; j++) {
                String memberName = sc.next();
                memberList.add(memberName);
                teams.put(memberName, teamName);
            }

            Collections.sort(memberList);
            members.put(teamName, memberList);
        }

        for (int i = 0; i < m; i++) {
            String name = sc.next();
            int query = sc.nextInt();

            if (query == 0) {
                List<String> memberList = members.get(name);
                for (String member : memberList) {
                    System.out.println(member);
                }
            } else {
                System.out.println(teams.get(name));
            }
        }

        sc.close();
    }
}