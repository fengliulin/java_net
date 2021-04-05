import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class ff {
    public static void main(String[] args) throws Exception{
        //要知道服务器的地址
        InetAddress serverIP = InetAddress.getByName("127.0.0.1");
        System.out.println(serverIP);

        //端口号
        int port = 10001;

        //创建一个socket连接
        Socket socket = new Socket(serverIP, port);
        //发送消息 io流
        OutputStream os = socket.getOutputStream();
        os.write(ff.getString().getBytes());


        os.flush();
        os.close();
        socket.close();


    }

    public static String getString() {
        return  "你好 （汉语词语） 编辑 讨论2 上传视频\n" +
                "你好，汉语词语，拼音是nǐ hǎo，是汉语中打招呼的敬语常用词语。作为一般对话的开场白。这也是个最基本的汉语词语。主要用于打招呼请教别人问题前的时候，或者单纯表示礼貌的时候等。\n" +
                "中文名 你好 外文名 hello 拼    音 nǐ hǎo 释    义 打招呼的敬语 适用场合 打招呼或请教别人问题前时 适宜人群 任何人 俄    文 Привет 法    文 Bonjour 阿拉伯文 مرحبا 希伯来文 שלום 注    音 ㄋㄧˇ ㄏㄠˇ\n" +
                "目录\n" +
                "1 释义\n" +
                "2 英语问候语\n" +
                "3 例句与英文\n" +
                "4 各国语言\n" +
                "释义编辑\n" +
                "“你好”是对别人的一种尊敬，遇到认识的人或陌生的人都可以说的。\n" +
                "“你好”主要用于打招呼请教别人问题前的时候，或者单纯表示礼貌的时候等。\n" +
                "“你好”的表达情感比较中性，与熟人说有点过于拘束，多和非熟人群体应用，表达一种礼貌。\n" +
                "英语问候语编辑\n" +
                "1.Hello!\n" +
                "2.Hi!\n" +
                "3.How are you?\n" +
                "4.How do you do?\n" +
                "5.Nice to meet you.\n" +
                "6.How's it going?\n" +
                "7.Pleased to meet you\n" +
                "8.What's up?很熟悉的人之间说的你好，类似于汉语中的你干嘛去，你怎么了。\n" +
                "9.Excuse me.\n" +
                "注：“How are you”为熟人之间的问候，“How do you do”和“Nice to meet you”是陌生人之间的问候。\n" +
                "打招呼的意思\n" +
                "ahoy\n" +
                "喂!啊嘿!啊呵!\n" +
                "g'day\n" +
                "【澳】【新】喂!你好!\n" +
                "aloha【夏威夷】\n" +
                "1.爱(=love)\n" +
                "2.你好,欢迎;珍重,再见\n" +
                "yo\n" +
                "1. 等一下!嗨!到!(回答点名时用)\n" +
                "2. 唷!(表示鼓励,警告)\n" +
                "例句与英文编辑\n" +
                "1. “你好”是一个习惯问候语。\n" +
                "\"How are you?\" is a conventional greeting.\n" +
                "2. 你好，真巧啊!\n" +
                "Hello there, what a coincidence!\n" +
                "3. 你好，史蒂文斯.\n" +
                "Hi there, Stevens.\n" +
                "4. “你好吗?”\n" +
                "“很好，谢谢”/“我很好，你呢”\n" +
                "`How are you?'\n" +
                "`Fine, thanks.' /‘I'm fine.And you?’\n" +
                "5. 你好呀,哥儿们!\n" +
                "Hi there,buddy!\n" +
                "6.今天怎么样？女士？\n" +
                "How are you today,lady?\n" +
                "7.你好！亲爱的!\n" +
                "Hello!honey!\n" +
                "各国语言编辑\n" +
                "Hello,Hi,Ahoy\n" +
                "都是英语中的问候，其中Ahoy是hello诞生之前“喂”的意思，自从hello随着电话的发明风行之后，这个词就不常用了。也有人认为 Ahoy是日语问候的说法。\n" +
                "Giorno--意大利语\n" +
                "Guten Tag--德语译音德语：古滕塌科！\n" +
                "Bonjour和'Allo--法语\n" +
                "G'day--澳大利亚的问候方式\n" +
                "Oi 和Olá--葡萄牙语\n" +
                "hola 和hala--西班牙语\n" +
                "Ahalan 阿拉伯语 译音艾海兰，或塞海蓝\n" +
                "Aloha--夏威夷人见面的问候方式\n" +
                "Namaste--尼泊尔语\n" +
                "Shalom--犹太人问候的语言，源自希伯来文「Shalom」（平安），有人说是阿拉伯语，不可靠。\n" +
                "Salut--拉丁语\n" +
                "Hoi--丹麦人问候语言（不确定）\n" +
                "Salut/Bonjour是法语的“你好” 译音“撒吕”/“帮厨儿”\n" +
                "pcipt是几内亚语“你好”\n" +
                "Saluton是世界语“你好”\n" +
                "안녕하세요（安宁哈赛有）\n" +
                "Здравствуйте--俄语\n" +
                "God dag.丹麦语的你好　Jó napot匈牙利的你好\n" +
                "Boa tarde葡萄牙语的你好.\n" +
                "Saluton.世界语“你好”最常见的说法，来自拉丁语。\n" +
                "日语--こんにちは罗马音：kon ni chi wa";
    }

}
