package javax.naming;

public class Info {
	/**
	 * javax.naming: </br>
	 * 这个包下面主要是用于访问命名服务的类和接口。比如，其中定义了Context接口，该接口是执行查找时命名服务的入口点 </br>
	 * 
	 * javax.naming.directory: </br>
	 * 主要包含用于访问目录服务的类与接口的扩展命名类和接口。例如，它增加了新的属性类，提供代表一个目录上下文的DirContext
	 * 接口，并且定义了用于检查和更新与目录对象相关的属性的方法。
	 * 
	 * javax.naming.event：
	 * 这个包主要为访问命名和目录服务时提供事件通知以实现监控功能。例如，它定义了一个NamingEvent类（用于表示由命名/目录服务
	 * 生成的事件），以及一个监视NamingEvents类的NamingListener接口。
	 * 
	 * javax.naming.ldap： 这个包为LDAPv3扩展操作和空间提供特定的支持。
	 * 
	 * javax.naming.spi：
	 * 这个包提供通过javax.naming及其相关包访问命名和目录服务的支持。只有那些SPI开发人员才对这个包感兴趣，Tomcat也提供了自己
	 * 的服务接口，所以也必须与这个包打交道。
	 */

}
