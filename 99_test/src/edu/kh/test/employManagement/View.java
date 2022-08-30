package edu.kh.test.employManagement;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;


public class View {

	private Scanner sc = new Scanner(System.in);
	private EmployManagementService service = new EmployManagementService();

	public void employManagementView() {

		int input = 0;
		do {
			System.out.println("\n------사원 관리 프로그램------");
			System.out.println("1. 새로운 사원 정보 추가");
			System.out.println("2. 전체 사원 정보 조회");
			System.out.println("3. 사번이 일치하는 사원 정보 조회");
			System.out.println("4. 사번이 일치하는 사원 정보 수정");
			System.out.println("5. 사번이 일치하는 사원 정보 삭제");
			System.out.println("6. 입력 받은 부서와 일치 모든 사원 정보 조회");
			System.out.println("7. 입력 받은 급여 이상을 받는 모든 사원 정보 조회");
			System.out.println("8. 부서별 급여 합 전체 조회");

			System.out.println("0. 프로그램 종료");

			try {
				System.out.print("메뉴 선택>>");
				input = sc.nextInt();
				System.out.println();

				switch (input) {
				case 1:
					addemp();
					break;
				case 2:
					selectAll();
					break;
				case 3:
					wjdqhwhghl();
					break;
				case 4:
					wjdqhtnwjd();
					break;
				case 5:
					wjdqhtkrwp();
					break;
				case 6:
					qntjtkdnjswhghl();
					break;
				case 7:
					rmqdudltkd();
					break;
				case 8:
					qntjrmqdu();
					break;
				case 0:
					System.out.println("프로그램 종료");
					break;
				default:
					System.out.println("잘못 입력하셨습니다.");

				}

				System.out.println();

			} catch (InputMismatchException e) {
				System.out.println("[error]입력 형식이 유효하지 않습니다.\n");
				input = -1;
				sc.nextLine();
			}
		} while (input != 0);
	}

	/**
	 * 1. 새로운 사원 정보 추가
	 */
	private void addemp() {

		System.out.println("=========사원 정보 추가========");

		// 사원 번호(사번),사원 이름,주민등록번호,이메일,전화번호,부서명,직급명,급여

		System.out.print("사원 번호(사번) : ");
		String empId = sc.next();

		System.out.print("사원 이름 : ");
		String empName = sc.next();

		System.out.print("주민등록번호 : ");
		String empNo = sc.next();

		System.out.print("이메일 : ");
		String email = sc.next();

		System.out.print("전화번호 : ");
		String phone = sc.next();

		System.out.print("부서명 : ");
		String departmentTitle = sc.next();

		System.out.print("직급명 : ");
		String jobName = sc.next();

		System.out.print("급여 : ");
		int salary = sc.nextInt();

		if (service.addemp(empId, empName, empNo, email, phone, departmentTitle, jobName, salary)) {
			System.out.println("[추가 완료]");
		} else {
			System.out.println("[error] 학생 정보 추가 실패");
		}

	}

	/**
	 * 2. 전체 사원 정보 조회
	 */
	private void selectAll() {
		List<EmployManagement> emList = service.getemList();

		for (EmployManagement e : emList) {
			System.out.println(e);
		}

	}

	/**
	 * 3. 사번이 일치하는 사원 정보 조회
	 */
	private void wjdqhwhghl() {
		System.out.println("[사번으로 검색]");
		System.out.println("검색할 사번을 입력하세요 : ");
		String empId=sc.next();
		
		List<EmployManagement>emList=service.wjdqhwhghl1(empId);
		
		if(resultList.isEmpty()) {
			System.out.println("검색된 결과가 없습니다.");
		}else {
			for(EmployManagement e : resultList) {
				System.out.println(e);
			}
		}
	}

	/**
	 * 4. 사번이 일치하는 사원 정보 수정
	 */
	private void wjdqhtnwjd() {

	}

	/**
	 * 5. 사번이 일치하는 사원 정보 삭제
	 */
	private void wjdqhtkrwp() {

	}

	/**
	 * 6. 입력 받은 부서와 일치 모든 사원 정보 조회
	 */
	private void qntjtkdnjswhghl() {

	}

	/**
	 * 7. 입력 받은 급여 이상을 받는 모든 사원 정보 조회
	 */
	private void rmqdudltkd() {

	}

	/**
	 * 8. 부서별 급여 합 전체 조회
	 */
	private void qntjrmqdu() {

	}

}
