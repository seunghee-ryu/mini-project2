package com.eomcs.pms.handler;

import java.io.BufferedReader;
import java.io.PrintWriter;

// Command 규칙에 따라 클래스를 정의한다.
public class EntryCommand implements Command {

  @Override
  public void execute(PrintWriter out, BufferedReader in) {

    out.println("-------------------------------------------------------------------------------------------------");
    out.println("게임을 시작하기에 앞서 플레이어 등록을 하겠습니다.");
    out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
    out.println("새로 시작하는 플레이어라면");
    out.println("'/newPlayer' 명령어를 입력하세요.");
    out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
    out.println("기존에 플레이 기록을 가지고 있는 플레이어라면");
    out.println("'/recordedPlayer' 명령어를 입력해서 플레이 기록을 확인하세요.");
    out.println("-------------------------------------------------------------------------------------------------");

  }
}

