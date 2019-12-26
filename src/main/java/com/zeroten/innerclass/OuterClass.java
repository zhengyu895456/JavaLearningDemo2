package com.zeroten.innerclass;

public class OuterClass {
    private Integer index;
    private String name;
    public OuterClass(int index, String name){
        this.index = index;
        this.name = name;
    }
    // 内部类：定义在其他类中的类，称为内部类
    private class InnerClass{
        private String name;
        public InnerClass(String name){
            this.name = name;
        }
        public void printInfo(){
//            StringBuilder tmp = new StringBuilder();
//            tmp.append("外围类index = ");
//            tmp.append(OuterClass.this.index);
//            tmp.append("，外围类name = ");
//            tmp.append(name);
//            System.out.println(tmp.toString());

            //使用局部内部类
            String name = "方法";
//            class Printclass{
//                void print(){
//                    StringBuilder tmp = new StringBuilder();
//                    tmp.append("外围类index = ");
//                    tmp.append(OuterClass.this.index);
//                    tmp.append("，外围类name = ");
//                    tmp.append(name);
//                    System.out.println(tmp.toString());
//                }
//            }
//            new Printclass().print();
            //使用匿名内部类
//            class PrintInterfaceImpl implements PrintInterface{
//                @Override
//                public void print(){
//
//                }
//            }
//            new PrintInterfaceImpl().print();

//            new PrintInterface(){
//                @Override
//                public void print(){
//                    StringBuilder tmp = new StringBuilder();
//                    tmp.append("外围类index = ");
//                    tmp.append(OuterClass.this.index);
//                    tmp.append("，外围类name = ");
//                    tmp.append(OuterClass.this.name);
//                    System.out.println(tmp.toString());
//                }
//            }.print();

            //使用匿名内部类 - 实现抽象类
//            new PrintAbstract(){
//                @Override
//                void print(){
//                    StringBuilder tmp = new StringBuilder();
//                    tmp.append("外围类index = ");
//                    tmp.append(OuterClass.this.index);
//                    tmp.append("，外围类name = ");
//                    tmp.append(OuterClass.this.name);
//                    System.out.println(tmp.toString());
//                }
//            }.print();
            //使用匿名内部类 - 类
            new PrintClass("类名"){
                @Override
                public void print(){
                    StringBuilder tmp = new StringBuilder();
                    tmp.append("外围类index = ");
                    tmp.append(OuterClass.this.index);
                    tmp.append("，外围类name = ");
                    tmp.append(super.name);
                    System.out.println(tmp.toString());
                }
            }.print();

        }
    }
    public static void main(String[] args){
        OuterClass outerClass = new OuterClass(1,"外部类");
        OuterClass.InnerClass innerClass = outerClass.new InnerClass("内部类");
        innerClass.printInfo();
    }
}
