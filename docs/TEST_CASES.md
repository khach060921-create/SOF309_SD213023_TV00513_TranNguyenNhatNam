# BỘ KỊCH BẢN KIỂM THỬ (TEST CASES) – QUANLYCAFE

## 1. KIỂM THỬ ĐĂNG NHẬP VÀ TÀI KHOẢN

| **Test Case ID** | **Chức năng** | **Mô tả ca kiểm thử** | **Loại test (Pos/Neg)** | **Các bước thực hiện** | **Dữ liệu kiểm thử (Test Data)** | **Kết quả mong đợi** | **Trạng thái (Pass/Fail)** |
|---|---|---|---|---|---|---|---|
| TC_AUTH_01 | Login | Đăng nhập thành công bằng tên đăng nhập | Positive | 1. Mở trang đăng nhập<br>2. Nhập username<br>3. Nhập password<br>4. Bấm Đăng nhập | Tài khoản hợp lệ | Đăng nhập thành công và chuyển đến trang chủ theo vai trò | Not Run |
| TC_AUTH_02 | Login | Đăng nhập thành công bằng số điện thoại | Positive | 1. Mở trang đăng nhập<br>2. Nhập số điện thoại<br>3. Nhập password<br>4. Bấm Đăng nhập | Số điện thoại đã đăng ký | Đăng nhập thành công | Not Run |
| TC_AUTH_03 | Login | Đăng nhập thất bại khi mật khẩu sai | Negative | 1. Nhập username hợp lệ<br>2. Nhập mật khẩu sai<br>3. Bấm Đăng nhập | Username hợp lệ, password sai | Hiển thị thông báo lỗi, không cho đăng nhập | Not Run |
| TC_AUTH_04 | Login | Đăng nhập thất bại khi bỏ trống mật khẩu | Negative | 1. Nhập username<br>2. Để trống password<br>3. Bấm Đăng nhập | Username hợp lệ, password rỗng | Hệ thống từ chối đăng nhập | Not Run |
| TC_AUTH_05 | Login | Đăng nhập thất bại khi tài khoản không tồn tại | Negative | 1. Nhập username không tồn tại<br>2. Nhập password<br>3. Bấm Đăng nhập | Username không tồn tại | Hiển thị thông báo lỗi | Not Run |
| TC_AUTH_06 | Register | Đăng ký tài khoản khách hàng hợp lệ | Positive | 1. Mở trang đăng ký<br>2. Nhập thông tin hợp lệ<br>3. Bấm Đăng ký | Thông tin khách hàng mới | Tạo tài khoản thành công | Not Run |
| TC_AUTH_07 | Register | Đăng ký thất bại khi thiếu thông tin bắt buộc | Negative | 1. Mở trang đăng ký<br>2. Bỏ trống trường bắt buộc<br>3. Bấm Đăng ký | Thiếu thông tin | Hệ thống thông báo lỗi và không tạo tài khoản | Not Run |
| TC_AUTH_08 | Logout | Đăng xuất khỏi hệ thống | Positive | 1. Đăng nhập<br>2. Bấm Đăng xuất | Tài khoản hợp lệ | Kết thúc phiên đăng nhập | Not Run |
| TC_AUTH_09 | Forgot Password | Nhập OTP hợp lệ | Positive | 1. Chọn quên mật khẩu<br>2. Nhận OTP qua email<br>3. Nhập OTP<br>4. Xác nhận | OTP hợp lệ trong 5 phút | Hệ thống chấp nhận OTP | Not Run |
| TC_AUTH_10 | Forgot Password | Nhập OTP đã hết hạn | Negative | 1. Yêu cầu OTP<br>2. Chờ quá 5 phút<br>3. Nhập OTP | OTP hết hạn | Hệ thống từ chối OTP | Not Run |
| TC_AUTH_11 | Forgot Password | Nhập OTP sai quá số lần cho phép | Negative | 1. Yêu cầu OTP<br>2. Nhập sai OTP liên tiếp 5 lần | OTP sai 5 lần | Hệ thống áp dụng giới hạn nhập OTP | Not Run |

## 2. KIỂM THỬ PHÂN QUYỀN

| **Test Case ID** | **Chức năng** | **Mô tả ca kiểm thử** | **Loại test (Pos/Neg)** | **Các bước thực hiện** | **Dữ liệu kiểm thử (Test Data)** | **Kết quả mong đợi** | **Trạng thái (Pass/Fail)** |
|---|---|---|---|---|---|---|---|
| TC_ROLE_01 | Admin | Admin truy cập trang quản lý | Positive | 1. Đăng nhập Admin<br>2. Mở trang quản lý | Tài khoản Admin | Truy cập thành công | Not Run |
| TC_ROLE_02 | Employee | Nhân viên truy cập chức năng sản phẩm | Positive | 1. Đăng nhập nhân viên<br>2. Mở trang sản phẩm | Tài khoản nhân viên | Truy cập theo quyền được cấp | Not Run |
| TC_ROLE_03 | Delivery | Nhân viên giao hàng xem đơn được phân công | Positive | 1. Đăng nhập giao hàng<br>2. Mở danh sách đơn | Tài khoản giao hàng | Hiển thị đơn được phân công | Not Run |
| TC_ROLE_04 | Authorization | Khách hàng truy cập trang Admin | Negative | 1. Đăng nhập khách hàng<br>2. Truy cập URL quản trị | Tài khoản khách hàng | Hệ thống từ chối truy cập | Not Run |
| TC_ROLE_05 | Authorization | Người chưa đăng nhập truy cập trang cần xác thực | Negative | 1. Mở URL cần đăng nhập khi chưa đăng nhập | Chưa có phiên đăng nhập | Hệ thống yêu cầu đăng nhập | Not Run |

## 3. KIỂM THỬ QUẢN LÝ NHÂN VIÊN VÀ TÀI KHOẢN

| **Test Case ID** | **Chức năng** | **Mô tả ca kiểm thử** | **Loại test (Pos/Neg)** | **Các bước thực hiện** | **Dữ liệu kiểm thử (Test Data)** | **Kết quả mong đợi** | **Trạng thái (Pass/Fail)** |
|---|---|---|---|---|---|---|---|
| TC_EMP_01 | Employee | Thêm nhân viên đủ 18 tuổi | Positive | 1. Đăng nhập Admin<br>2. Mở form nhân viên<br>3. Nhập thông tin<br>4. Bấm Lưu | Nhân viên 18 tuổi trở lên | Thêm nhân viên thành công | Not Run |
| TC_EMP_02 | Employee | Thêm nhân viên chưa đủ 18 tuổi | Negative | 1. Mở form nhân viên<br>2. Nhập ngày sinh tương ứng 17 tuổi<br>3. Bấm Lưu | Nhân viên 17 tuổi | Hệ thống từ chối thêm nhân viên | Not Run |
| TC_EMP_03 | Employee | Cập nhật thông tin nhân viên | Positive | 1. Chọn nhân viên<br>2. Chỉnh sửa thông tin<br>3. Bấm Lưu | Thông tin mới hợp lệ | Cập nhật thành công | Not Run |
| TC_EMP_04 | Employee | Xóa mềm nhân viên | Positive | 1. Chọn nhân viên<br>2. Chọn Xóa<br>3. Xác nhận | Nhân viên đang hoạt động | Nhân viên được xóa mềm | Not Run |
| TC_EMP_05 | Employee | Kiểm tra ảnh hưởng trước khi xóa nhân viên | Positive | 1. Chọn nhân viên có đơn hàng<br>2. Chọn chức năng xóa<br>3. Xem trước tác động | Nhân viên có đơn hoàn thành và chưa hoàn thành | Hiển thị đúng các dữ liệu bị ảnh hưởng | Not Run |
| TC_ACC_01 | Account | Tạo tài khoản nhân viên | Positive | 1. Mở chức năng tài khoản<br>2. Nhập thông tin nhân viên<br>3. Lưu | Thông tin hợp lệ | Tài khoản được tạo thành công | Not Run |
| TC_ACC_02 | Account | Tạo tài khoản nhân viên giao hàng | Positive | 1. Chọn chế độ giao hàng<br>2. Nhập thông tin<br>3. Lưu | Nhân viên giao hàng hợp lệ | Tài khoản có vai trò giao hàng | Not Run |

## 4. KIỂM THỬ QUẢN LÝ KHÁCH HÀNG

| **Test Case ID** | **Chức năng** | **Mô tả ca kiểm thử** | **Loại test (Pos/Neg)** | **Các bước thực hiện** | **Dữ liệu kiểm thử (Test Data)** | **Kết quả mong đợi** | **Trạng thái (Pass/Fail)** |
|---|---|---|---|---|---|---|---|
| TC_CUS_01 | Customer | Xem danh sách khách hàng | Positive | 1. Đăng nhập Admin<br>2. Mở quản lý khách hàng | Dữ liệu khách hàng có sẵn | Hiển thị danh sách khách hàng | Not Run |
| TC_CUS_02 | Customer | Thêm khách hàng mới | Positive | 1. Mở form khách hàng<br>2. Nhập thông tin<br>3. Bấm Lưu | Thông tin hợp lệ | Thêm khách hàng thành công | Not Run |
| TC_CUS_03 | Customer | Sửa thông tin khách hàng | Positive | 1. Chọn khách hàng<br>2. Sửa thông tin<br>3. Lưu | Thông tin mới hợp lệ | Cập nhật thành công | Not Run |
| TC_CUS_04 | Customer | Xóa khách hàng còn lịch sử đơn hàng | Negative | 1. Chọn khách hàng có đơn hàng<br>2. Chọn Xóa | Khách hàng có lịch sử giao dịch | Hệ thống từ chối xóa | Not Run |
| TC_CUS_05 | Customer | Cập nhật hồ sơ cá nhân | Positive | 1. Đăng nhập khách hàng<br>2. Mở hồ sơ<br>3. Sửa thông tin<br>4. Lưu | Thông tin hợp lệ | Hồ sơ được cập nhật | Not Run |

## 5. KIỂM THỬ QUẢN LÝ SẢN PHẨM VÀ LỊCH SỬ GIÁ

| **Test Case ID** | **Chức năng** | **Mô tả ca kiểm thử** | **Loại test (Pos/Neg)** | **Các bước thực hiện** | **Dữ liệu kiểm thử (Test Data)** | **Kết quả mong đợi** | **Trạng thái (Pass/Fail)** |
|---|---|---|---|---|---|---|---|
| TC_PRO_01 | Product | Thêm sản phẩm hợp lệ | Positive | 1. Mở quản lý sản phẩm<br>2. Nhập thông tin<br>3. Bấm Lưu | Tên, giá và số lượng hợp lệ | Thêm sản phẩm thành công | Not Run |
| TC_PRO_02 | Product | Thêm sản phẩm có giá bằng 0 | Negative | 1. Mở form sản phẩm<br>2. Nhập giá 0<br>3. Bấm Lưu | Giá = 0 | Hệ thống từ chối dữ liệu không hợp lệ | Not Run |
| TC_PRO_03 | Product | Thêm sản phẩm có giá âm | Negative | 1. Mở form sản phẩm<br>2. Nhập giá âm<br>3. Bấm Lưu | Giá = -1000 | Hệ thống từ chối dữ liệu | Not Run |
| TC_PRO_04 | Product | Cập nhật thông tin sản phẩm | Positive | 1. Chọn sản phẩm<br>2. Sửa thông tin<br>3. Lưu | Thông tin hợp lệ | Cập nhật thành công | Not Run |
| TC_PRO_05 | Product | Tìm kiếm sản phẩm theo từ khóa | Positive | 1. Mở danh sách sản phẩm<br>2. Nhập từ khóa<br>3. Tìm kiếm | Từ khóa có tồn tại | Hiển thị sản phẩm phù hợp | Not Run |
| TC_PRO_06 | Product | Xóa sản phẩm đã phát sinh bán hàng | Negative | 1. Chọn sản phẩm đã bán<br>2. Chọn Xóa | Sản phẩm có lịch sử bán | Hệ thống từ chối xóa | Not Run |
| TC_PRO_07 | Product | Kiểm tra tồn kho bằng 0 | Boundary | 1. Chọn sản phẩm<br>2. Nhập tồn kho bằng 0<br>3. Lưu | Số lượng = 0 | Hệ thống xử lý theo quy tắc tồn kho | Not Run |
| TC_PRO_08 | Price History | Thay đổi giá sản phẩm | Positive | 1. Chọn sản phẩm<br>2. Thay đổi giá<br>3. Nhập lý do<br>4. Lưu | Giá cũ và giá mới | Cập nhật giá và ghi nhận lịch sử giá | Not Run |

## 6. KIỂM THỬ KHUYẾN MÃI

| **Test Case ID** | **Chức năng** | **Mô tả ca kiểm thử** | **Loại test (Pos/Neg)** | **Các bước thực hiện** | **Dữ liệu kiểm thử (Test Data)** | **Kết quả mong đợi** | **Trạng thái (Pass/Fail)** |
|---|---|---|---|---|---|---|---|
| TC_PROMO_01 | Promotion | Áp dụng khuyến mãi theo phần trăm | Positive | 1. Chọn sản phẩm có khuyến mãi<br>2. Kiểm tra giá giảm | Giảm 10% | Tính tiền giảm đúng | Not Run |
| TC_PROMO_02 | Promotion | Áp dụng khuyến mãi theo số tiền | Positive | 1. Chọn sản phẩm có khuyến mãi<br>2. Kiểm tra giá giảm | Giảm 10.000 đồng | Tính tiền giảm đúng | Not Run |
| TC_PROMO_03 | Promotion | Kiểm tra mức giảm tối đa | Boundary | 1. Áp dụng khuyến mãi<br>2. Kiểm tra số tiền giảm | Mức giảm vượt giới hạn | Số tiền giảm không vượt mức tối đa | Not Run |
| TC_PROMO_04 | Promotion | Kiểm tra khuyến mãi hết hạn | Negative | 1. Mở cửa hàng<br>2. Kiểm tra khuyến mãi hết hạn | Khuyến mãi đã kết thúc | Không hiển thị khuyến mãi hết hạn | Not Run |
| TC_PROMO_05 | Promotion | Kiểm tra khuyến mãi chưa bắt đầu | Negative | 1. Mở cửa hàng<br>2. Kiểm tra khuyến mãi chưa đến ngày bắt đầu | Khuyến mãi chưa hiệu lực | Không áp dụng khuyến mãi | Not Run |

## 7. KIỂM THỬ GIỎ HÀNG VÀ ĐẶT HÀNG

| **Test Case ID** | **Chức năng** | **Mô tả ca kiểm thử** | **Loại test (Pos/Neg)** | **Các bước thực hiện** | **Dữ liệu kiểm thử (Test Data)** | **Kết quả mong đợi** | **Trạng thái (Pass/Fail)** |
|---|---|---|---|---|---|---|---|
| TC_CART_01 | Cart | Thêm sản phẩm vào giỏ hàng | Positive | 1. Đăng nhập khách hàng<br>2. Chọn sản phẩm<br>3. Thêm vào giỏ | Sản phẩm hợp lệ | Sản phẩm xuất hiện trong giỏ hàng | Not Run |
| TC_CART_02 | Cart | Cập nhật số lượng sản phẩm | Positive | 1. Mở giỏ hàng<br>2. Thay đổi số lượng<br>3. Cập nhật | Số lượng hợp lệ | Số lượng và thành tiền được cập nhật | Not Run |
| TC_CART_03 | Cart | Xóa sản phẩm khỏi giỏ hàng | Positive | 1. Mở giỏ hàng<br>2. Chọn sản phẩm<br>3. Xóa | Sản phẩm trong giỏ | Sản phẩm được xóa khỏi giỏ | Not Run |
| TC_CART_04 | Order | Đặt hàng từ giỏ hàng | Positive | 1. Thêm sản phẩm vào giỏ<br>2. Mở giỏ hàng<br>3. Xác nhận đặt hàng | Giỏ hàng có sản phẩm hợp lệ | Đơn hàng được tạo thành công | Not Run |
| TC_CART_05 | Order | Đặt hàng khi giỏ hàng trống | Negative | 1. Mở giỏ hàng trống<br>2. Thực hiện đặt hàng | Giỏ hàng rỗng | Hệ thống không tạo đơn hàng rỗng | Not Run |

## 8. KIỂM THỬ ĐƠN HÀNG VÀ GIAO HÀNG

| **Test Case ID** | **Chức năng** | **Mô tả ca kiểm thử** | **Loại test (Pos/Neg)** | **Các bước thực hiện** | **Dữ liệu kiểm thử (Test Data)** | **Kết quả mong đợi** | **Trạng thái (Pass/Fail)** |
|---|---|---|---|---|---|---|---|
| TC_ORDER_01 | Order | Chuyển đơn từ Chờ nhận sang Đang làm | Positive | 1. Đăng nhập nhân viên<br>2. Mở đơn hàng<br>3. Cập nhật trạng thái | Đơn Chờ nhận | Trạng thái chuyển thành Đang làm | Not Run |
| TC_ORDER_02 | Order | Chuyển trạng thái đơn không hợp lệ | Negative | 1. Chọn đơn Chờ nhận<br>2. Thử chuyển thẳng sang Hoàn thành | Đơn Chờ nhận | Hệ thống từ chối chuyển trạng thái không hợp lệ | Not Run |
| TC_ORDER_03 | Order | Phân công nhân viên giao hàng | Positive | 1. Mở đơn hàng<br>2. Chọn nhân viên giao hàng<br>3. Lưu | Nhân viên giao hàng hợp lệ | Đơn được phân công đúng người | Not Run |
| TC_ORDER_04 | Order | Sửa đơn đã hoàn thành | Negative | 1. Mở đơn hoàn thành<br>2. Thử chỉnh sửa | Đơn Hoàn thành | Hệ thống không cho phép sửa | Not Run |
| TC_ORDER_05 | Order | Xóa đơn đã có hóa đơn | Negative | 1. Chọn đơn đã có hóa đơn<br>2. Thử xóa | Đơn đã lập hóa đơn | Hệ thống không cho phép xóa | Not Run |
| TC_DEL_01 | Delivery | Xem đơn được giao | Positive | 1. Đăng nhập giao hàng<br>2. Mở danh sách đơn | Đơn được phân công | Hiển thị đúng đơn được giao | Not Run |
| TC_DEL_02 | Delivery | Kiểm tra đơn đã hủy | Negative | 1. Đăng nhập giao hàng<br>2. Mở danh sách đơn | Đơn đã hủy | Đơn đã hủy không hiển thị trong danh sách cần giao | Not Run |

## 9. KIỂM THỬ HÓA ĐƠN, THANH TOÁN VÀ DOANH THU

| **Test Case ID** | **Chức năng** | **Mô tả ca kiểm thử** | **Loại test (Pos/Neg)** | **Các bước thực hiện** | **Dữ liệu kiểm thử (Test Data)** | **Kết quả mong đợi** | **Trạng thái (Pass/Fail)** |
|---|---|---|---|---|---|---|---|
| TC_BILL_01 | Invoice | Kiểm tra tổng tiền hóa đơn | Positive | 1. Mở hóa đơn<br>2. Kiểm tra tổng tiền | Hóa đơn có chi tiết sản phẩm | Tổng tiền chính xác | Not Run |
| TC_BILL_02 | Invoice | Kiểm tra tiền giảm giá | Positive | 1. Mở hóa đơn có khuyến mãi<br>2. Kiểm tra giảm giá | Hóa đơn có giảm giá | Tiền giảm giá chính xác | Not Run |
| TC_BILL_03 | Invoice | Kiểm tra thành tiền | Positive | 1. Mở hóa đơn<br>2. Đối chiếu tổng tiền và giảm giá | Dữ liệu hóa đơn hợp lệ | Thành tiền được tính đúng | Not Run |
| TC_PAY_01 | SePay | Tạo phiên thanh toán | Positive | 1. Chọn thanh toán chuyển khoản<br>2. Tạo phiên thanh toán | Đơn hàng hợp lệ | Phiên thanh toán được tạo | Not Run |
| TC_PAY_02 | SePay | Nhận webhook/IPN hợp lệ | Positive | 1. Gửi thông báo thanh toán thử nghiệm<br>2. Kiểm tra kết quả xử lý | Dữ liệu IPN hợp lệ | Hệ thống xử lý thanh toán đúng | Not Run |
| TC_PAY_03 | SePay | Nhận webhook/IPN không hợp lệ | Negative | 1. Gửi dữ liệu IPN sai<br>2. Kiểm tra phản hồi | Dữ liệu IPN không hợp lệ | Hệ thống từ chối hoặc không ghi nhận thanh toán | Not Run |
| TC_REV_01 | Revenue | Ghi nhận doanh thu từ hóa đơn | Positive | 1. Tạo hoặc cập nhật hóa đơn<br>2. Kiểm tra doanh thu | Hóa đơn hợp lệ | Doanh thu được ghi nhận theo ngày | Not Run |
| TC_REV_02 | Revenue | Xem doanh thu theo tháng | Positive | 1. Đăng nhập Admin<br>2. Mở Dashboard<br>3. Xem doanh thu tháng | Dữ liệu hóa đơn trong tháng | Hiển thị doanh thu chính xác | Not Run |

## 10. KIỂM THỬ DASHBOARD VÀ HÌNH ẢNH

| **Test Case ID** | **Chức năng** | **Mô tả ca kiểm thử** | **Loại test (Pos/Neg)** | **Các bước thực hiện** | **Dữ liệu kiểm thử (Test Data)** | **Kết quả mong đợi** | **Trạng thái (Pass/Fail)** |
|---|---|---|---|---|---|---|---|
| TC_DASH_01 | Dashboard | Kiểm tra tổng số khách hàng | Positive | 1. Đăng nhập Admin<br>2. Mở Dashboard | Database có dữ liệu khách hàng | Hiển thị đúng số lượng khách hàng | Not Run |
| TC_DASH_02 | Dashboard | Kiểm tra thống kê sản phẩm và đơn hàng | Positive | 1. Mở Dashboard<br>2. Kiểm tra số liệu | Database có dữ liệu | Số liệu hiển thị chính xác | Not Run |
| TC_IMG_01 | Banner | Tải ảnh banner hợp lệ | Positive | 1. Đăng nhập Admin<br>2. Chọn ảnh banner<br>3. Tải lên | File ảnh hợp lệ | Banner được tải lên thành công | Not Run |
| TC_IMG_02 | Product Image | Hiển thị ảnh sản phẩm | Positive | 1. Mở cửa hàng<br>2. Xem sản phẩm có ảnh | Đường dẫn ảnh hợp lệ | Ảnh sản phẩm hiển thị đúng | Not Run |

## 11. TỔNG KẾT

| Nhóm chức năng | Số lượng Test Case |
|---|---:|
| Đăng nhập và tài khoản | 11 |
| Phân quyền | 5 |
| Nhân viên và tài khoản | 7 |
| Khách hàng | 5 |
| Sản phẩm và lịch sử giá | 8 |
| Khuyến mãi | 5 |
| Giỏ hàng và đặt hàng | 5 |
| Đơn hàng và giao hàng | 7 |
| Hóa đơn, thanh toán và doanh thu | 8 |
| Dashboard và hình ảnh | 4 |
| **Tổng cộng** | **65** |

**Lưu ý:** Các Test Case được thiết kế dựa trên đặc tả nghiệp vụ. Trạng thái ban đầu là Not Run và chỉ được chuyển thành Pass hoặc Fail sau khi thực hiện kiểm thử thực tế.