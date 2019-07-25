package com.factolapp.kytkat;

class Questions {
    String Q;
    private String A1;
    private String A2;
    private String A3;
    private String A4;
    private Integer GoodAnswer;
    private boolean Used;

    Questions(String q, String a1, String a2, String a3, String a4, String goodAnswer) {
        Q = q;
        A1 = a1;
        A2 = a2;
        A3 = a3;
        A4 = a4;
        GoodAnswer = Integer.parseInt(goodAnswer);
        Used = false;
    }

    String getA1() {
        return A1;
    }

    String getA2() {
        return A2;
    }

    String getA3() {
        return A3;
    }

    String getA4() {
        return A4;
    }

    String getGoodAnswer() {
        String res = "";
        switch (GoodAnswer) {
            case 1: res = A1;
                    break;
            case 2: res = A2;
                    break;
            case 3: res = A3;
                    break;
            case 4: res = A4;
                    break;
        }
        return res;
    }

    public boolean getUsed() {
        return Used;
    }

    public void setUsed(boolean state) {
        Used = state;
    }
}

