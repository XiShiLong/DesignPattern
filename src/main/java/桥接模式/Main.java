package 桥接模式;

import 桥接模式.phone.HuaWeiMobilePhone;
import 桥接模式.phone.MiMobilePhone;
import 桥接模式.phone.MobilePhoneAbstraction;
import 桥接模式.soft.ChatSoft;
import 桥接模式.soft.GameSoft;

public class Main {
    public static void main(String[] args) {

        HuaWeiMobilePhone huaweiPhone=new HuaWeiMobilePhone(new ChatSoft());
        MiMobilePhone miPhone=new MiMobilePhone(new GameSoft());

        huaweiPhone.gpuTurborRun();
        miPhone.gpuTurborRun();

        huaweiPhone.run();
        miPhone.run();
    }
}
