package user;

import java.util.concurrent.atomic.AtomicLong;

public class User {

    // 필드
    private static final AtomicLong idCounter = new AtomicLong(1);  // 카운터
    private long id;                                                          // 아이디

    // 생성자
    public User() {
        this.id = idCounter.getAndIncrement();
    }

    // 메소드
    public long getId() {
        return id;
    }
}
