# 一个可爱讨伐者 夏娜
> 这个可饿的大魔王👹，当然要打败他

📍 springboot webflux和 mongodb 构建的cms.

## 环境配置
###  开发环境
推荐使用docker拉取`docker pull mongo`
并且运行`docker run -p 27017:27017 --name shana_mongo -itd mongo` 
这样就配置好了mongodb。 没有数据库名和密码超级方便开发。  
然后进去，创建数据库shana
也可以在配置文件里面修改

但是线上不允许线上使用，因为灰长不安全。 也不建议线上使用docker数据库
