package lxf.filter;

import java.io.IOException;

import javax.servlet.DispatcherType;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter(servletNames="AsyncFilter",filterName="AsyncFilter", asyncSupported=true,urlPatterns={"/index.jsp"},dispatcherTypes={DispatcherType.REQUEST,DispatcherType.ASYNC})
public class AsyncFilter implements Filter {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		System.out.println("startFilter-------------------AsyncFilter");
		arg2.doFilter(arg0, arg1);
		System.out.println("endFilter-------------------AsyncFilter");

	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub

	}

}
