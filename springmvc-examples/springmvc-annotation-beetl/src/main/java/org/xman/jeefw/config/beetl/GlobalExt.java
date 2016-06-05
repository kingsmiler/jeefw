package org.xman.jeefw.config.beetl;

import org.beetl.core.GroupTemplate;
import org.beetl.core.Template;
import org.beetl.ext.web.WebRenderExt;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GlobalExt implements WebRenderExt {

    static long version = System.currentTimeMillis();

    @Override
    public void modify(Template template, GroupTemplate arg1,
                       HttpServletRequest arg2,
                       HttpServletResponse response) {
        response.setBufferSize(1024 * 24);
        //js,css 的版本编号
        template.binding("version", version);
    }

}
