package boardJDBC;

import java.util.List;
import java.util.Scanner;


public class BoardController {
	
	private Scanner scan;
	private Service svc;
	private boolean flag; 
	
	public BoardController() {
		scan = new Scanner(System.in);
		svc = new BoardServiceImpl();
		flag = true;
		printMenu();
	}
	
	private void printMenu() {
		// flag가 true면 계속 메뉴 출력
		while(flag) {
			System.out.println("--게시판--");
			System.out.println("1.글쓰기|2.게시글목록|3.글상세보기");
			System.out.println("4.글수정|5.글삭제|6.종료");
			System.out.println("menu >>");
			
			int menu = scan.nextInt();
			
			switch (menu) {
			case 1:register(); break;
			case 2:list(); break;
			case 3:detailList(); break;
			case 4:modify(); break;
			case 5:remove(); break;
			default: flag = false; break;
			}
		}
	}

	private void remove() {
		// TODO Auto-generated method stub
		System.out.println("삭제 게시글 번호>");
		int bno = scan.nextInt();
		
		int isOk = svc.remove(bno);
		System.out.println(isOk>0?"삭제 성공":"삭제 실패");
		
	}
	private void modify() {
		// TODO Auto-generated method stub
		System.out.println("수정 게시글 번호>");
		int bno = scan.nextInt();
		System.out.println("제목 :");
		String title = scan.next();
		System.out.println("내용 :");
		scan.nextLine();
		String content = scan.nextLine();
		
		BoardVO b = new BoardVO(bno, title, content);
		
		int isOk = svc.modify(b);
		System.out.println(isOk>0?"수정 성공":"수정 실패");
		
	}

	private void detailList() {
		// TODO Auto-generated method stub
		System.out.println("게시글 번호 > ");
		int bno = scan.nextInt();
		BoardVO b = svc.detail(bno);
		b.printDetail();
		
	}

	private void list() {
		// TODO Auto-generated method stub
		List<BoardVO> list = svc.list();
		for(BoardVO b : list) {
			System.out.println(b);
		}
		
	}

	private void register() {
		// TODO Auto-generated method stub
		System.out.println("제목:");
		String title = scan.next();
		System.out.println("작성자:");
		String writer = scan.next();
		scan.nextLine();
		System.out.println("내용:");
		String content = scan.nextLine();
		
		BoardVO b = new BoardVO(title, writer, content);
		int isOk = svc.register(b);
		System.out.println("게시글등록"+((isOk>0)?"성공":"실패"));
		
	}
	
}
