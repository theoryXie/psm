package whu.web.psm.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.Parameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.List;

@Configuration // 标注一个配置类
@EnableSwagger2 // 提供swagger注解
@ComponentScan("whu.web.psm.controller")//扫描控制器包下的文件
public class SwaggerConfig {

    @Bean
    public Docket createRestApi() {
        //添加head参数配置start
        ParameterBuilder tokenPar = new ParameterBuilder();
        List<Parameter> pars = new ArrayList<>();
        tokenPar.name("Authorization").description("令牌").modelRef(new ModelRef("string")).parameterType("header").required(false).build();
        pars.add(tokenPar.build());
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("whu.web.psm"))
                .paths(PathSelectors.any())
                .build()
                .globalOperationParameters(pars);//注意这里
    }

    //展现API文档的基本信息
    private ApiInfo apiInfo(){
        //联系人信息(展现在主页)
        Contact contact = new Contact("xsy",
                "","827041735@qq.com");
        return new ApiInfoBuilder()
                .title("psm平台API")
                .description("前后端交互的API")
                .contact(contact)
                .version("1.0")
                .build();
    }
}
