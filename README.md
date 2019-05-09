# -Challenge-Classes-Product-Inventory-Project-
1. class Product: khai báo các thuộc tính của product với từ khóa private
2. -tạo getter, setter cho các thuộc tính
3. -tạo hàm dựng không có tham số, có tham số cho class
4. class Inventory
5. -addProduct: thêm một sản phẩm, nếu sản phẩm không trùng id với các sản phẩm có trong list thì thêm mới
nếu id trùng với một sản phẩm có trong list thì xét nếu giá của hai sản phẩm không bằng nhau
add kg thực hiện, còn nếu giá bằng nhau, số lượng cửa sản phẩm có trong list sẽ cộng thêm với
số lượng cửa sản phẩm được thêm.
6. -removeProduct: xóa một product ra khỏi list
7. -increaseQuantity : kiểm tra sản phẩm có id được nhập có tồn tại, nếu có thì số lượng của sản phẩm đó cộng thêm
                      với số lượng được nhập.
8. -decreaseQuantity : kiểm tra sản phẩm có id được nhập có tồn tại,  tiếp tục kiểm tra nếu số lượng của sản phẩm ít hơn
                        hoặc bằng với số lượng giảm thì sản phẩm bị xóa khỏi list, còn không, số lượng sản phẩm sẽ giảm đi 
                        số lượng được nhập.
9. -inventoryValue : hàm thống kê giá trị tòn kho, lấy sớ lượng nhân giá của các sản phẩm.
10. -show : show các sản phẩm có trong list
11. InventoryDemo : tạo các sản phẩm để kiểm tra các hàm của class Inventory.
                      
