package com.eomcs.pms.handler;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;
import com.eomcs.pms.domain.Item;

public class ItemListCommand implements Command {

  List<Item> itemList;

  public ItemListCommand(List<Item> list) {
    this.itemList = list;
  }


  @Override
  public void execute(PrintWriter out, BufferedReader in) {
    out.println("[아이템 목록]");

    // 전체 목록을 조회할 때 `Iterator` 객체를 사용한다.
    // 만약 목록의 일부만 조회하면다면 인덱스를 직접 다루는 이전 방식을 사용해야 한다.
    Iterator<Item> iterator = itemList.iterator();

    while (iterator.hasNext()) {
      Item item = iterator.next();
      out.printf("%s, %s\n",
          item.getNo(),
          item.getName()
          );
    }

    out.println("'/move/hallway' 명령어를 이용해 복도로 이동합니다.");
  }

}
