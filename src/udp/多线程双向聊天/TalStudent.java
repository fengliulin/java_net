package udp.多线程双向聊天;

public class TalStudent {

    public static void main(String[] args) {
        new Thread(new TalkSend(7777, "localhost",9999)).start();
        new Thread(new TalkReceive(8888, "老师")).start();
    }
}
