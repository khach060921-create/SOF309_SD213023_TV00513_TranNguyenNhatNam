# ĐẶC TẢ NGHIỆP VỤ HỆ THỐNG QUANLYCAFE (SPECIFICATIONS)

## 1. THÔNG TIN DỰ ÁN

- **Tên dự án:** QuanLyCafe
- **Loại hệ thống:** Website quản lý và bán hàng trực tuyến cho quán cà phê.
- **Công nghệ:** Java, Jakarta Servlet, JSP, JPA, Hibernate, SQL Server, Jakarta Mail.
- **Môi trường chạy:** Localhost.
- **URL:** http://localhost:8080
- **Đối tượng sử dụng:** Quản lý (Admin), Nhân viên, Nhân viên giao hàng và Khách hàng.

## 2. MÔ TẢ HỆ THỐNG

QuanLyCafe là hệ thống hỗ trợ quản lý hoạt động kinh doanh quán cà phê và bán sản phẩm trực tuyến. Hệ thống cho phép quản lý tài khoản, nhân viên, khách hàng, sản phẩm, đơn hàng, hóa đơn, khuyến mãi và doanh thu.

Hệ thống có bốn vai trò người dùng với quyền truy cập và chức năng khác nhau.

## 3. QUY TẮC NGHIỆP VỤ (BUSINESS RULES)

### 3.1. Tài khoản và đăng nhập

- Người dùng có thể đăng nhập bằng tên đăng nhập hoặc số điện thoại.
- Khách hàng có thể tự đăng ký tài khoản.
- Người dùng có thể đăng xuất khỏi hệ thống.
- Mật khẩu được mã hóa bằng PBKDF2.
- Mật khẩu cũ dạng chữ thường được nâng cấp khi đăng nhập thành công.
- Người dùng quên mật khẩu có thể yêu cầu mã OTP gửi qua email.
- Mã OTP có hiệu lực trong 5 phút.
- Người dùng bị giới hạn tối đa 5 lần nhập OTP sai.
- Hệ thống phân quyền thành Admin, Nhân viên, Giao hàng và Khách hàng.

### 3.2. Quản lý nhân viên

- Admin có quyền thêm, sửa và xóa mềm nhân viên.
- Nhân viên phải đủ 18 tuổi.
- Khi xóa nhân viên, hệ thống kiểm tra các đơn hàng và hóa đơn liên quan.
- Các đơn hàng và hóa đơn chưa hoàn thành được xử lý theo quy tắc xóa của hệ thống.
- Dữ liệu đơn hàng đã hoàn thành được giữ lại.

### 3.3. Quản lý tài khoản

- Admin có thể tạo tài khoản cho nhân viên.
- Tài khoản có thể được tạo theo chế độ nhân viên thông thường hoặc nhân viên giao hàng.
- Vai trò tài khoản được xác định dựa trên chức vụ của nhân viên.

### 3.4. Quản lý khách hàng

- Admin có thể xem, thêm, sửa và xóa khách hàng.
- Không được xóa khách hàng khi vẫn còn lịch sử đơn hàng hoặc hóa đơn liên quan.
- Khách hàng có thể cập nhật thông tin cá nhân và xóa tài khoản theo quy định hệ thống.

### 3.5. Quản lý sản phẩm

- Nhân viên có quyền thêm, sửa, xóa và tìm kiếm sản phẩm.
- Sản phẩm có thông tin tên, hình ảnh, thành phần, kích cỡ và tồn kho.
- Không được xóa sản phẩm nếu sản phẩm đã phát sinh giao dịch bán hàng.
- Hệ thống hỗ trợ tìm kiếm sản phẩm theo từ khóa.
- Kích cỡ sản phẩm có thể có phụ thu.

### 3.6. Quản lý lịch sử giá

- Hệ thống lưu lại lịch sử thay đổi giá sản phẩm.
- Thông tin lịch sử bao gồm giá cũ, giá mới, lý do thay đổi và ngày áp dụng.
- Mỗi lần thay đổi giá phải ghi nhận lịch sử tương ứng.

### 3.7. Quản lý khuyến mãi

- Hệ thống hỗ trợ khuyến mãi theo phần trăm hoặc số tiền cố định.
- Có thể thiết lập mức giảm tối đa.
- Khuyến mãi có ngày bắt đầu và ngày kết thúc.
- Chỉ các chương trình khuyến mãi còn hiệu lực mới được hiển thị cho khách hàng.

### 3.8. Quản lý giỏ hàng

- Khách hàng có thể sử dụng chức năng cửa hàng trực tuyến để xem sản phẩm.
- Hệ thống hỗ trợ quản lý giỏ hàng và chi tiết giỏ hàng.
- Chi tiết giỏ hàng có thông tin sản phẩm và số lượng.
- Khi đặt hàng, dữ liệu giỏ hàng được liên kết với đơn hàng theo nghiệp vụ hệ thống.

### 3.9. Quản lý đơn hàng

- Đơn hàng có các trạng thái: Chờ nhận, Đang làm, Đang giao, Hoàn thành và Đã hủy.
- Hệ thống kiểm tra tính hợp lệ khi chuyển trạng thái đơn hàng.
- Nhân viên có thể cập nhật trạng thái và phân công nhân viên giao hàng.
- Nhân viên giao hàng chỉ xem các đơn được phân công cho mình.
- Đơn hàng đã hoàn thành hoặc đã có hóa đơn không được chỉnh sửa hoặc xóa theo quy định hệ thống.

### 3.10. Quản lý hóa đơn và thanh toán

- Hệ thống lưu thông tin hóa đơn, tổng tiền, giảm giá và thành tiền.
- Hệ thống hỗ trợ thanh toán chuyển khoản qua SePay.
- Quá trình thanh toán sử dụng phiên thanh toán và webhook/IPN.
- Thông tin thanh toán được xử lý theo nghiệp vụ hệ thống.

### 3.11. Quản lý doanh thu

- Hệ thống ghi nhận doanh thu từ hóa đơn.
- Mỗi hóa đơn tương ứng với một dòng doanh thu theo logic nghiệp vụ.
- Admin có thể xem tổng doanh thu và doanh thu theo tháng.
- Dashboard hiển thị các số liệu tổng quan về hoạt động kinh doanh.

### 3.12. Quản lý hình ảnh và banner

- Hình ảnh sản phẩm và banner được lưu bên ngoài thư mục ứng dụng.
- Hệ thống phục vụ hình ảnh sản phẩm qua đường dẫn `/uploads/*`.
- Banner khuyến mãi được phục vụ qua `/promo-banners/*`.
- Admin có thể tải ảnh banner khuyến mãi lên hệ thống.

## 4. PHÂN QUYỀN NGƯỜI DÙNG

| Vai trò | Quyền chính |
|---|---|
| Admin | Quản lý nhân viên, tài khoản, khách hàng, đơn hàng, sản phẩm, doanh thu và Dashboard |
| Nhân viên | Quản lý sản phẩm, lịch sử giá, hóa đơn và xử lý đơn hàng |
| Giao hàng | Xem đơn được phân công và hóa đơn liên quan |
| Khách hàng | Đăng ký, đăng nhập, xem sản phẩm, quản lý hồ sơ, giỏ hàng và đặt hàng |

## 5. PHẠM VI KIỂM THỬ

### 5.1. Kiểm thử chức năng

- Đăng ký, đăng nhập, đăng xuất và quên mật khẩu.
- Kiểm tra phân quyền theo vai trò.
- Quản lý nhân viên, tài khoản và khách hàng.
- Quản lý sản phẩm và lịch sử giá.
- Quản lý giỏ hàng và đơn hàng.
- Quản lý hóa đơn và thanh toán.
- Quản lý khuyến mãi.
- Kiểm tra doanh thu và Dashboard.

### 5.2. Kiểm thử dữ liệu

- Kiểm tra dữ liệu nhập vào có hợp lệ hay không.
- Kiểm tra dữ liệu trùng lặp.
- Kiểm tra các trường bắt buộc.
- Kiểm tra tính toàn vẹn dữ liệu giữa các chức năng.
- Kiểm tra dữ liệu lưu trữ trong SQL Server.

### 5.3. Kiểm thử bảo mật

- Kiểm tra quyền truy cập theo vai trò.
- Kiểm tra truy cập trái phép vào các chức năng.
- Kiểm tra cơ chế xác thực tài khoản.
- Kiểm tra mật khẩu và OTP.

## 6. GHI CHÚ VÀ GIỚI HẠN

- Đặc tả này được xây dựng dựa trên mô tả chức năng và cấu trúc code hiện có của dự án.
- Các chức năng thanh toán SePay, tạo đơn hàng từ giỏ hàng và xử lý hóa đơn cần được đối chiếu thêm với mã nguồn tương ứng.
- Các quy tắc kiểm tra dữ liệu chưa được xác nhận trong code sẽ được đánh dấu cần xác minh trước khi tạo Test Case.
- Không giả định một chức năng đã hoạt động thành công chỉ dựa trên tên lớp hoặc tên phương thức.

