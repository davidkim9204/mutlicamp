package controller;

import controller.action.Action;
import controller.action.BoardCheckPassAction;
import controller.action.BoardCheckPassFormAction;
import controller.action.BoardDeleteAction;
import controller.action.BoardListAction;
import controller.action.BoardUpdateAction;
import controller.action.BoardUpdateFormAction;
import controller.action.BoardViewAction;
import controller.action.BoardWriteAction;
import controller.action.BoardWriteFormAction;
import controller.action.CommentDeleteAction;
import controller.action.CommentWriteAction;

public class ActionFactory {
	private static ActionFactory instance = new ActionFactory();

	private ActionFactory() {
		super();
	}

	public static ActionFactory getInstance() {
		return instance;
	}

	public Action getAction(String command) {
		Action action = null;
		System.out.println("ActionFactory :" + command);
		/* 추가된 부분 */
		if (command.equals("board_list")) {
			action = new BoardListAction();
		} else if (command.equals("board_write_form")) {
			action = new BoardWriteFormAction();
		} else if (command.equals("board_write")) {
			action = new BoardWriteAction();
		} else if (command.equals("board_view")) {
			action = new BoardViewAction();
		} else if (command.equals("board_check_pass_form")) {
			action = new BoardCheckPassFormAction();
		} else if (command.equals("board_check_pass")) {
			action = new BoardCheckPassAction();
		} else if (command.equals("board_update_form")) {
			action = new BoardUpdateFormAction();
		} else if (command.equals("board_update")) {
			action = new BoardUpdateAction();
		} else if (command.equals("board_delete")) {
			action = new BoardDeleteAction();
		}else if (command.equals("commentWrite")) {
			action = new CommentWriteAction();
		}else if (command.equals("commentDelete")) {
			action = new CommentDeleteAction();
		}
		return action;
	}
}
