package next.admin.login.bean;

import com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar.String;

public class LoginBean {
        private String username;
        private String password;
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
}
