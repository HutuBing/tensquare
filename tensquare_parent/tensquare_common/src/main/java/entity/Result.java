package entity;

import lombok.Data;

@Data
public class Result {

    private boolean flag;
    private Integer code;
    private String msg;
    private Object data;

    public Result() {
    }

    public Result(boolean flag, Integer code, String msg, Object data) {
        this.flag = flag;
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public Result(Object data) {
        this.data = data;
        this.flag = true;
        this.msg = "success";
        this.code = 2000;
    }

    public Result(boolean flag, Integer code, String msg) {
        this.flag = flag;
        this.code = code;
        this.msg = msg;
    }
}
