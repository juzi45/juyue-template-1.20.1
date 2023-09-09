package name.juyue;

import name.juyue.content.register.JuYueBlocks;
import name.juyue.content.register.JuYueItemGroups;
import name.juyue.content.register.JuYueItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JuYue implements ModInitializer {
    public static final String MOD_ID = "juyue", NAME = "Ju Yue";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        JuYueBlocks.register();
        JuYueItems.register();
        JuYueItemGroups.register();
    }

    /*
    来自 KrLite 的一些建议：
    1.  请遵守 Java 的基础命名规范，包括但不限于：
        1.1.  方法和变量使用 camelCase 命名，正确的有 myMethod、aMethodWithMultipleWords 等，错误的有 MyMethod、ihaveamethod、IDONTknowwhatIMDoing 等；
        1.2.  软件包使用 snake_case 命名，正确的有 item、my_package、i_have_a_package 等，错误的有 Item、MYPACKAGE、thisIsAPackage 等；
        1.3.  常量使用 UPPER_CAMEL_CASE 命名，正确的有 MY_CONSTANT、A_CONSTANT_WITH_MULTIPLE_WORDS 等，错误的有 MYCONSTANT、myConstant、my_constant 等。

    2.  请及时使用 IntelliJ IDEA 软件的格式化功能来规范代码风格：
        2.1.  格式化选中区域：代码>重新格式化代码，默认快捷键为 Alt+Ctrl+L；
        2.2.  格式化当前文件：代码>重新格式化文件，默认快捷键为 Alt+Shift+Ctrl+L。

    3.  运算符号周围、逗号后、if/for/while 等控制符号后、具有前缀的代码块大括号前请添加空格，例如：
        3.1.  运算符周围，正确的有 1 + 1 = 2 等，错误的有 1+1=2 等；
        3.2.  逗号后，正确的有 int a, b, c;、myMethod(int a, int b) {} 等，错误的有 int a,b,c、myMethod(int a,int b) {} 等；
        3.3.  if/for/while 等控制符号后，正确的有 if (a == 0) {}、do {} while (true);、for (item in items) {} 等；
        3.4.  具有前缀的代码块大括号前，正确的有 if (a == 0) {}、myMethod() {} 等，错误的有 if (a == 0){}、myMethod(){} 等。

    4.  请学习英文！请尽量不要在代码和文件名中使用拼音（如果必须使用拼音，请务必添加 JavaDoc 或者注释，而且请务必使用正确的后鼻音），百度翻译是一个好工具。
        我这辈子都不可能猜出来既被你称为 "JINGSHI" 又被你称为 "baboljinsi" 的是什么东西！

    5.  求求你注意一下英文中单复数和连词的使用。

    6.  在 Fabric Wiki (https://fabricmc.net/wiki) 上你能得到几乎任何基础可用的代码片段。比如，注册方块和物品的代码片段。

    7.  有问题及时问。
     */
}
