# KẾ HOẠCH KIỂM THỬ (TEST PLAN)

- **Dự án:** QuanLyCafe – Hệ thống quản lý quán cà phê
- **Sinh viên:** Trần Nguyễn Nhất Nam – TV00513

---

## 1. MỤC TIÊU KIỂM THỬ

- Kiểm tra các chức năng chính của hệ thống như đăng nhập, đăng ký, quản lý nhân viên, khách hàng, sản phẩm, khuyến mãi và hóa đơn.
- Phát hiện lỗi trong quá trình sử dụng hệ thống, đảm bảo các chức năng hoạt động đúng theo yêu cầu.
- Kiểm tra quyền truy cập của từng vai trò: Admin, Employee, Delivery và Customer.
- Đảm bảo dữ liệu được thêm, sửa, xóa và hiển thị chính xác.
- Chuẩn bị cơ sở cho việc kiểm thử tự động và tích hợp kiểm thử với GitHub Actions trong các giai đoạn tiếp theo.

## 2. PHẠM VI KIỂM THỬ

- **In-Scope:**
  - Kiểm thử chức năng đăng nhập, đăng xuất và đăng ký tài khoản.
  - Kiểm thử phân quyền người dùng.
  - Kiểm thử quản lý nhân viên, khách hàng và tài khoản.
  - Kiểm thử quản lý sản phẩm, giá bán, tồn kho và khuyến mãi.
  - Kiểm thử giỏ hàng, đặt hàng và xử lý đơn hàng.
  - Kiểm thử giao hàng, hóa đơn và thanh toán.
  - Kiểm thử các chức năng thống kê và hiển thị dữ liệu.

- **Out-of-Scope:**
  - Kiểm thử hiệu năng với số lượng người dùng lớn (Performance Test).
  - Kiểm thử bảo mật chuyên sâu (Security Penetration Test).
  - Kiểm thử trên nhiều thiết bị và trình duyệt khác nhau ở quy mô lớn.

## 3. TIÊU CHÍ HOÀN THÀNH

- Tất cả các test case trong phạm vi kiểm thử phải được thực hiện và ghi nhận kết quả.
- Các chức năng quan trọng phải hoạt động đúng theo kết quả mong đợi.
- Không còn lỗi nghiêm trọng ảnh hưởng đến các chức năng chính của hệ thống.
- Các test case bị lỗi phải được ghi nhận, sửa chữa và kiểm thử lại.
- Kết quả kiểm thử phải được cập nhật đầy đủ trong file TEST_CASES.md.