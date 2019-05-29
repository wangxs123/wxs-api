package common.enums;

/**
 * ResultCode枚举
 *
 * @author wxs
 * @date 2019-05-28 20:12
 */
public enum ResultCodeEnum  implements BaseEnum {
    /**
     * 操作成功
     */
    OPERATION_SUCCESS(1000,"操作成功"),
    /**
     * 请求参数不合法
     */
    REQUEST_PARAM_ERROR(2001,"请求参数不合法"),
    /**
     * 缺少请求参数
     */
    REQUEST_PARAM_LACK(2002,"缺少请求参数"),
    /**
     * 请求参数为空
     */
    REQUEST_PARAM_EMPTY(2003,"请求参数为空"),
    /**
     * 查询数据失败
     */
    QUERY_DATA_ERROR(3001,"查询数据失败"),
    /**
     * 新增数据失败
     */
    APPEND_DATA_ERROR(3002,"新增数据失败"),
    /**
     * 修改数据失败
     */
    MODIFY_DATA_ERROR(3003,"修改数据失败"),
    /**
     * 删除数据失败
     */
    DELETE_DATA_ERROR(3004,"删除数据失败"),
    /**
     * 内部调用接口错误
     */
    INSIDE_INTERFACE_INVOKE_ERROR(4001,"内部调用接口错误"),
    /**
     * 未知错误
     */
    UNKNOWN_ERROR(9001,"未知错误"),
    /**
     * 系统异常
     */
    SYSTEM_EXCEPTION(9002,"系统异常"),
    /**
     * 并发错误
     */
    CONCURRENCY_ERROR(9003,"并发错误");

    /**
     * 键
     */
    private  Integer key;
    /**
     * 描述
     */
    private  String desc;

    /**
     * 键
     *
     * @return
     */
    @Override
    public Integer key() {
        return key;
    }

    /**
     * 描述
     *
     * @return
     */
    @Override
    public String desc() {
        return desc;
    }


    ResultCodeEnum(final Integer key, final String desc) {
        this.key=key;
        this.desc=desc;
    }
}
