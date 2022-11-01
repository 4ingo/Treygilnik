public class Triangle {
    /*Triangle деген класс тузунуз.
    Класстын 3 полеси болсун a, b, c.
    Класстын "area" деген методу болсун.
    "area" методу полелериндеги маалыматтарга(маалымат объектти тузгондон кийин берилет)
    таянып консолго уч бурчтуктун аянтын чыгарсын.
     */
    int a;
    int b;
    int c;
    public double area(){
        double pp = (a + b + c) / 2.0;

        return  Math.sqrt(pp * (pp - a) * (pp - b) * (pp - c));
    }
}
