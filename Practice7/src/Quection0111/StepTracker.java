/*
11번 문제. 사람별 걸음 수 기록 및 분석
 */



package Quection0111;

import java.util.*;

public class StepTracker {
    public static void main(String[] args) {
        HashMap<String, ArrayList<Integer>> stepRecords = new HashMap<>(); // 사람별 걸음 수 기록
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("이름과 걸음수>> ");
            String input = scanner.nextLine(); // 사용자 입력 받기

            if (input.equals("그만")) { // "그만" 입력 시 프로그램 종료
                break;
            }

            String[] parts = input.split(" "); // 입력을 공백으로 분리
            String name = parts[0]; // 이름 추출

            ArrayList<Integer> steps = stepRecords.getOrDefault(name, new ArrayList<>()); // 이름에 해당하는 기록 가져오기

            try {
                for (int i = 1; i < parts.length; i++) {
                    steps.add(Integer.parseInt(parts[i])); // 걸음 수 추가
                }
                stepRecords.put(name, steps); // HashMap에 업데이트
            } catch (NumberFormatException e) {
                System.out.println("걸음 수 입력이 잘못되었습니다.");
            }
        }

        // 걸음 수가 가장 많은 사람 찾기
        String topPerson = "";
        int maxSteps = 0;

        for (Map.Entry<String, ArrayList<Integer>> entry : stepRecords.entrySet()) {
            int totalSteps = entry.getValue().stream().mapToInt(Integer::intValue).sum(); // 총 걸음 수 계산
            if (totalSteps > maxSteps) {
                maxSteps = totalSteps;
                topPerson = entry.getKey();
            }
        }

        System.out.println("걸음수가 가장 많은 사람은 " + topPerson + " " + maxSteps + "보 입니다.");

        // 특정 사람의 걸음 수 검색
        while (true) {
            System.out.print("검색할 이름>> ");
            String name = scanner.nextLine();

            if (name.equals("그만")) { // "그만" 입력 시 프로그램 종료
                break;
            }

            if (stepRecords.containsKey(name)) { // 입력한 이름이 목록에 있는 경우
                ArrayList<Integer> steps = stepRecords.get(name);
                int totalSteps = steps.stream().mapToInt(Integer::intValue).sum(); // 총 걸음 수 계산
                double averageSteps = totalSteps / (double) steps.size(); // 평균 계산
                System.out.println(steps + " 평균 " + (int) averageSteps);
            } else { // 입력한 이름이 목록에 없는 경우
                System.out.println(name + "은(는) 없는 학생입니다.");
            }
        }

        scanner.close(); // Scanner 리소스 해제
    }
}
