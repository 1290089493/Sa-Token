package cn.dev33.satoken.temp.jwt.error;

/**
 * 定义 sa-token-temp-jwt 所有异常细分状态码 
 * 
 * @author click33
 * @since 2022-10-31
 */
public interface SaTempJwtErrorCode {

	/** jwt 模式没有提供秘钥 */
	int CODE_30301 = 30301;

	/** jwt 模式不可以删除 Token */
	int CODE_30302 = 30302;

	/** Token已超时 */
	int CODE_30303 = 30303;

}
