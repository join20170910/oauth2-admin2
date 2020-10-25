基于内存存储令牌
https://www.funtl.com/zh/spring-security-oauth2/基于内存存储令牌.html#概述
请求地址
http://localhost:8080/oauth/authorize

配置认证服务器
配置客户端信息：ClientDetailsServiceConfigurer
inMemory：内存配置
withClient：客户端标识
secret：客户端安全码
authorizedGrantTypes：客户端授权类型
scopes：客户端授权范围
redirectUris：注册回调地址
配置 Web 安全
通过 GET 请求访问认证服务器获取授权码
端点：/oauth/authorize
通过 POST 请求利用授权码访问认证服务器获取令牌
端点：/oauth/token
附：默认的端点 URL

/oauth/authorize：授权端点
/oauth/token：令牌端点
/oauth/confirm_access：用户确认授权提交端点
/oauth/error：授权服务错误信息端点
/oauth/check_token：用于资源服务访问的令牌解析端点
/oauth/token_key：提供公有密匙的端点，如果你使用 JWT 令牌的话
#


客户端授权认证 url 
1 浏览器输入 url
http://localhost:8080/oauth/authorize?client_id=admin&response_type=code
2 在  输入 账号密码 成功后 在返回  授权码
浏览器地址上还会包含一个授权码（code=1JuO6V）

通过授权码向服务器申请令牌
