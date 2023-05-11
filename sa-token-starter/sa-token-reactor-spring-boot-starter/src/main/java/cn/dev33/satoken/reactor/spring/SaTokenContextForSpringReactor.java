package cn.dev33.satoken.reactor.spring;

import cn.dev33.satoken.context.SaTokenContextForThreadLocal;
import cn.dev33.satoken.spring.SaPathMatcherHolder;

/**
 * Sa-Token 上下文处理器 [ Spring Reactor 版本实现 ] ，基于 SaTokenContextForThreadLocal 定制
 * 
 * @author click33
 * @since <= 1.34.0
 */
public class SaTokenContextForSpringReactor extends SaTokenContextForThreadLocal {
	
	/**
	 * 重写路由匹配方法
	 */
	@Override
	public boolean matchPath(String pattern, String path) {
		return SaPathMatcherHolder.getPathMatcher().match(pattern, path);
	}
	
}
