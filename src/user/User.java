package user;

import java.util.concurrent.atomic.AtomicLong;

public class User {

    // 필드
    private static final AtomicLong idCounter = new AtomicLong(1);  // 카운터
    private long id;                                                          // 유저 아이디
    private String name;                                                      // 유저 이름

    // 생성자
    public User(String name) {
        this.id = idCounter.getAndIncrement();
        this.name = name;
    }

    // 메소드
    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
