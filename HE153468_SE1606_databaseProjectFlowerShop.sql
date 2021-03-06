USE [FlowerShop]
GO
/****** Object:  Table [dbo].[Account_HE153468_SE1606]    Script Date: 3/21/2022 3:47:48 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Account_HE153468_SE1606](
	[uID] [int] IDENTITY(1,1) NOT NULL,
	[user] [varchar](255) NULL,
	[pass] [varchar](255) NULL,
	[email] [varchar](255) NULL,
	[isSell] [int] NULL,
	[isAdmin] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[uID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Category_HE153468_SE1606]    Script Date: 3/21/2022 3:47:48 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Category_HE153468_SE1606](
	[cid] [int] IDENTITY(1,1) NOT NULL,
	[cname] [nvarchar](50) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[cid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[InformationAccount_HE153468_SE1606]    Script Date: 3/21/2022 3:47:48 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[InformationAccount_HE153468_SE1606](
	[uid] [int] NOT NULL,
	[description] [nvarchar](max) NULL,
	[address] [nvarchar](max) NULL,
	[phone] [nvarchar](max) NULL,
	[wallet] [money] NULL,
	[image] [nvarchar](max) NULL,
	[FullName] [nvarchar](max) NULL
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Order_HE153468_SE1606]    Script Date: 3/21/2022 3:47:48 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Order_HE153468_SE1606](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[date] [date] NOT NULL,
	[uid] [int] NOT NULL,
	[totalmoney] [money] NULL,
	[comfirm] [int] NULL,
	[ship] [int] NULL,
	[done] [int] NULL,
 CONSTRAINT [PK_Order] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[OrderLine_HE153468_SE1606]    Script Date: 3/21/2022 3:47:48 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[OrderLine_HE153468_SE1606](
	[oid] [int] NOT NULL,
	[pid] [int] NOT NULL,
	[quantity] [float] NOT NULL,
	[price] [float] NOT NULL,
 CONSTRAINT [PK_OrderLine] PRIMARY KEY CLUSTERED 
(
	[oid] ASC,
	[pid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[product_HE153468_SE1606]    Script Date: 3/21/2022 3:47:48 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[product_HE153468_SE1606](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[name] [nvarchar](max) NULL,
	[image] [nvarchar](max) NULL,
	[price] [money] NULL,
	[title] [nvarchar](max) NULL,
	[description] [nvarchar](max) NULL,
	[cateID] [int] NULL,
	[sell_ID] [int] NULL,
	[quantity] [int] NULL,
 CONSTRAINT [PK_product] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[Account_HE153468_SE1606] ON 

INSERT [dbo].[Account_HE153468_SE1606] ([uID], [user], [pass], [email], [isSell], [isAdmin]) VALUES (1, N'Adam', N'123456', N'adam@gmail.com', 1, 0)
INSERT [dbo].[Account_HE153468_SE1606] ([uID], [user], [pass], [email], [isSell], [isAdmin]) VALUES (3, N'Boy', N'123456', N'Boy@gmail.com', 0, 0)
INSERT [dbo].[Account_HE153468_SE1606] ([uID], [user], [pass], [email], [isSell], [isAdmin]) VALUES (4, N'Khanh', N'123456', N'Trinhbaokhanh1306@gmail.com', 1, 1)
INSERT [dbo].[Account_HE153468_SE1606] ([uID], [user], [pass], [email], [isSell], [isAdmin]) VALUES (32, N'Tho', N'123456', N'daoanhtho1310@gmail.com', 0, 0)
INSERT [dbo].[Account_HE153468_SE1606] ([uID], [user], [pass], [email], [isSell], [isAdmin]) VALUES (1033, N'Bao', N'123456', N'khanhtbhe153468@fpt.edu.vn', 0, 0)
SET IDENTITY_INSERT [dbo].[Account_HE153468_SE1606] OFF
GO
SET IDENTITY_INSERT [dbo].[Category_HE153468_SE1606] ON 

INSERT [dbo].[Category_HE153468_SE1606] ([cid], [cname]) VALUES (1, N'Hoa Tình Yêu')
INSERT [dbo].[Category_HE153468_SE1606] ([cid], [cname]) VALUES (2, N'Hoa Sinh Nhật')
INSERT [dbo].[Category_HE153468_SE1606] ([cid], [cname]) VALUES (3, N'Hoa Cưới')
INSERT [dbo].[Category_HE153468_SE1606] ([cid], [cname]) VALUES (4, N'Hoa Chúc Mừng')
SET IDENTITY_INSERT [dbo].[Category_HE153468_SE1606] OFF
GO
INSERT [dbo].[InformationAccount_HE153468_SE1606] ([uid], [description], [address], [phone], [wallet], [image], [FullName]) VALUES (4, N'Đẹp Trai ', N'Hòa Lạc', N'0898637030', 999999999.0000, N'images/khanh.png', N'Trịnh Bảo Khánh')
INSERT [dbo].[InformationAccount_HE153468_SE1606] ([uid], [description], [address], [phone], [wallet], [image], [FullName]) VALUES (32, N'Ngáo', N'Hòa Lạc', N'0386989386', NULL, N'https://scontent.fhan14-1.fna.fbcdn.net/v/t39.30808-6/267620261_1200550110468623_4349566173612924130_n.jpg?_nc_cat=105&ccb=1-5&_nc_sid=09cbfe&_nc_ohc=6yvbk4oWOGMAX_koe0T&_nc_ht=scontent.fhan14-1.fna&oh=00_AT9kMDl0_y5avYJkJLlbZx4GghkI_f4B632ngrNU8Szz7A&oe=623508B4', N'Thi Tho Dao')
INSERT [dbo].[InformationAccount_HE153468_SE1606] ([uid], [description], [address], [phone], [wallet], [image], [FullName]) VALUES (3, N'Boy', N'Hòa Lạc', N'0386989386', NULL, N'images/pic-1.png', N'Nguyễn Văn Boy')
INSERT [dbo].[InformationAccount_HE153468_SE1606] ([uid], [description], [address], [phone], [wallet], [image], [FullName]) VALUES (1033, N'dfad', N'Hòa Lạc', N'0386989386', NULL, N'images/pic-1.png', N'Hoa Khuyễn Mãi')
INSERT [dbo].[InformationAccount_HE153468_SE1606] ([uid], [description], [address], [phone], [wallet], [image], [FullName]) VALUES (1, N'adam', N'Hòa Lạc', N'098765432', NULL, N'images/pic-1.png', N'Adam')
GO
SET IDENTITY_INSERT [dbo].[Order_HE153468_SE1606] ON 

INSERT [dbo].[Order_HE153468_SE1606] ([id], [date], [uid], [totalmoney], [comfirm], [ship], [done]) VALUES (6, CAST(N'2022-03-18' AS Date), 3, 2500.0000, 1, 1, 1)
INSERT [dbo].[Order_HE153468_SE1606] ([id], [date], [uid], [totalmoney], [comfirm], [ship], [done]) VALUES (7, CAST(N'2022-03-18' AS Date), 32, 1700.0000, 1, 1, 0)
INSERT [dbo].[Order_HE153468_SE1606] ([id], [date], [uid], [totalmoney], [comfirm], [ship], [done]) VALUES (1004, CAST(N'2022-03-21' AS Date), 3, 800.0000, 0, 0, 0)
INSERT [dbo].[Order_HE153468_SE1606] ([id], [date], [uid], [totalmoney], [comfirm], [ship], [done]) VALUES (1005, CAST(N'2022-03-21' AS Date), 3, 800.0000, 1, 1, 1)
INSERT [dbo].[Order_HE153468_SE1606] ([id], [date], [uid], [totalmoney], [comfirm], [ship], [done]) VALUES (1006, CAST(N'2022-03-21' AS Date), 3, 4200.0000, 1, 1, 1)
SET IDENTITY_INSERT [dbo].[Order_HE153468_SE1606] OFF
GO
INSERT [dbo].[OrderLine_HE153468_SE1606] ([oid], [pid], [quantity], [price]) VALUES (6, 1, 2, 800)
INSERT [dbo].[OrderLine_HE153468_SE1606] ([oid], [pid], [quantity], [price]) VALUES (6, 2, 1, 900)
INSERT [dbo].[OrderLine_HE153468_SE1606] ([oid], [pid], [quantity], [price]) VALUES (7, 1, 1, 800)
INSERT [dbo].[OrderLine_HE153468_SE1606] ([oid], [pid], [quantity], [price]) VALUES (7, 2, 1, 900)
INSERT [dbo].[OrderLine_HE153468_SE1606] ([oid], [pid], [quantity], [price]) VALUES (1005, 1, 1, 800)
INSERT [dbo].[OrderLine_HE153468_SE1606] ([oid], [pid], [quantity], [price]) VALUES (1006, 1, 3, 800)
INSERT [dbo].[OrderLine_HE153468_SE1606] ([oid], [pid], [quantity], [price]) VALUES (1006, 2, 2, 900)
GO
SET IDENTITY_INSERT [dbo].[product_HE153468_SE1606] ON 

INSERT [dbo].[product_HE153468_SE1606] ([id], [name], [image], [price], [title], [description], [cateID], [sell_ID], [quantity]) VALUES (1, N'Giây Phút Êm Đềm', N'images/giay-phut-em-dem.png', 800.0000, N'Bó hoa đơn giản với hoa hồng trắng phối hợp cùng hoa baby tạo nên sức cuốn hút đặc biệt. Màu trắng của sự tinh khôi như màu váy cô dâu trong ngày vui trọng đại của đời mình. Bó hoa khoác lên mình một vẻ đẹp sang trọng đến lạ lùng.', N'Bó hoa cưới Giây Phút Êm Đềm gồm các loại hoa tươi:

- 30 Hồng trắng nhí

- 3 Hoa baby

* Shop HoaYeuThuong cam kết chất lượng hoa trên từng sản phẩm hoa được giao đến tay người nhận', 1, 1, 20)
INSERT [dbo].[product_HE153468_SE1606] ([id], [name], [image], [price], [title], [description], [cateID], [sell_ID], [quantity]) VALUES (2, N'Nụ Hôn Cho Em', N'images/nu-hon-cho-em.png', 900.0000, N'Với chủ đạo hoa hồng da và tone màu nhẹ nhàng tựa như những nụ hôn ngọt ngào chàng trai dành cho người phụ nữ của đời mình trong ngày hạnh phúc nhất cuộc đời mình. Bó hoa cưới thích hợp cho những cô dâu thích sự giản dị và mộc mạc', N'Bó hoa cưới Nụ Hôn Cho Em gồm các loại tươi:

- 25 Hồng da

- 5 Cát tường hồng viền

- 10 Cẩm chướng đơn viền tím', 1, 1, 40)
INSERT [dbo].[product_HE153468_SE1606] ([id], [name], [image], [price], [title], [description], [cateID], [sell_ID], [quantity]) VALUES (3, N'Ngọn Lửa Tình Yêu', N'https://hyt.r.worldssl.net/hinh-anh/hoa-cam-tay/4831/ngon-lua-tinh-yeu.jpg', 880.0000, N'Bó hoa thiết kế với tone màu đỏ rực sắc với điểm nhấn trắng tinh khôi dành cho cô dâu thích hồng đỏ cũng như tone màu đỏ - màu của sự mãnh liệt như ngọn lửa yêu thương bùng chày mãi mãi', N'Mẫu thiết kế gồm có:

- Hoa hồng đỏ

- Lan hồ điệp trắng

- Hoa lá phụ kiện kèm theo', 1, 3, 30)
INSERT [dbo].[product_HE153468_SE1606] ([id], [name], [image], [price], [title], [description], [cateID], [sell_ID], [quantity]) VALUES (4, N'Will You Marry Me !!!', N'images/will-you-marry-me-.png', 900.0000, N'Bó hồng đỏ được bó tròn với hoa được tuyển chọn như lời cầu hôn của chàng trai dành cho người con gái với mong muốn được sống bên nhau mãi mãi. Tình yêu trọn vẹn như hình dáng của bó hoa với tone màu đỏ thắm - cực kì đơn giản', N'Mẫu thiết kế gồm cò: 

- 30 Hồng đỏ sa

- 10 Đinh lăng', 1, 1, 50)
INSERT [dbo].[product_HE153468_SE1606] ([id], [name], [image], [price], [title], [description], [cateID], [sell_ID], [quantity]) VALUES (5, N'Bên Nhau Trọn Đời', N'images/ben-nhau-tron-doi.png', 750.0000, N'Như tên gọi của mình bó hoa với nhiều tone màu nhẹ nhàng trong trẻo như cuộc sống hôn nhân luôn bình yên và hạnh phúc bên nhau đi hết cuộc đời này
', N'Giày thể thao Adidas Advantage Clean sử dụng chất liệu cao cấp, thoáng khí cả mặt trong và mặt ngoài giúp bạn luôn dễ chịu và thoải mái dù mang trong thời gian dài. Giày Adidas VS Advantage có bộ đế êm ái giúp người đi tận hưởng cảm giác thoải mái cho cả ngày dài vận động. Thời trang vốn là sự quay vòng, và thiết kế đơn giản, cổ điển đại diện cho xu hướng thời trang hoài cổ đang quay trở lại và được giới trẻ đón nhận nồng nhiệt hơn bao giờ hết. Không giống như những loại giày thể thao thông thường, mẫu giày adidas Advantage có kiểu dáng "thon thả" hơn, khiến cho đôi chân không bị trở nên lạc lõng so với đôi giày thể thao vốn bị "mang tiếng" là thô kệch, không đẹp mắt. Thêm nữa, đế của loại giày này được thiết kế theo kiểu đế xuồng 3cm vừa tạo tính đàn hồi cho từng bước đi mà cũng "tiện tay" giúp cho người đi "ăn gian" chiều cao khá đáng kể. Và tất nhiên, điểm cộng tuyệt vời nhất chính là sự phối hợp tuyệt vời từ kiểu dáng đến màu sắc của các nhà thiết kế tài hoa đã làm cho đôi giày phù hợp với mọi giới tính, mọi lứa tuổi, mix được với rất nhiều phong cách khác nhau', 1, 4, 30)
INSERT [dbo].[product_HE153468_SE1606] ([id], [name], [image], [price], [title], [description], [cateID], [sell_ID], [quantity]) VALUES (6, N'Chỉ mình em', N'https://hyt.r.worldssl.net/hinh-hoa-tuoi/hoa-sinh-nhat/12585_chi-minh-em.jpg', 300.0000, N'Hoa Chúc Mừng Sinh Nhật', N'Cẩm chướng chùm hồng nhạt : 5
Hoa baby : 1
Lá phụ khác: 5
Pink OHara: 1', 1, 2, 50)
INSERT [dbo].[product_HE153468_SE1606] ([id], [name], [image], [price], [title], [description], [cateID], [sell_ID], [quantity]) VALUES (7, N'Ngàn ánh dương', N'https://hyt.r.worldssl.net/hinh-hoa-tuoi/hoa-sinh-nhat/11607_ngan-anh-duong.jpg', 500.0000, N'Giỏ hoa vàng rực rỡ từ sự kết hợp của hoa hướng dương, cúc calimero, hoa sao vàng...đem đến cho người nhận một cảm giác tràn đầy năng lượng cho một ngày mới. Hãy tạo một bất ngờ nho nhỏ dành tặng cho người thân yêu của bạn nhé.', N'Sản phẩm bao gồm:
Cẩm chướng đơn vàng : 10
Cúc calimero vàng: 5
Hoa sao vàng: 3
Hướng dương : 5
Lá trúc nâu: 3', 1, 3, 20)
INSERT [dbo].[product_HE153468_SE1606] ([id], [name], [image], [price], [title], [description], [cateID], [sell_ID], [quantity]) VALUES (8, N'Bên Nhau Mãi Mãi', N'images/ben-nhau-mai-mai.png', 900.0000, N'Bó hoa cưới với tone màu pastel nhẹ nhàng với chủ đạo là hoa hồng như lời cầu chúc cho hạnh phúc của cô dâu và chú rể cũng như sự vui mừng của hai họ. Họ yêu nhau và cũng nhau sống bên nhau mãi mãi bền lâu không chia rời', N'Bó hoa cưới Mãi Mãi Bên Nhau gồm các loại hoa:

- Hoa hồng sen

- Hoa hồng da

- Hoa hồng trắng

- Cát tường trắng

- Hoa lá phụ khác ', 1, 1, 60)
INSERT [dbo].[product_HE153468_SE1606] ([id], [name], [image], [price], [title], [description], [cateID], [sell_ID], [quantity]) VALUES (9, N'Ta Mãi Bên Nhau', N'images/ta-mai-ben-nhau.png', 780.0000, N'Bó hoa với tone màu dịu dàng, ngọt ngào thêm gia vị cho cuộc sống hôn nhân luôn đẹp đẽ và bình yên. Phù hợp với cô dâu yêu thích sự nhẹ nhàng, dịu êm như viên kẹo ngọt', N'Mẫu thiết kế gồm có:

- 20 Hồng da

- 10 Cát tường trắng

- 3 Cẩm tú cầu xanh', 1, 1, 40)
INSERT [dbo].[product_HE153468_SE1606] ([id], [name], [image], [price], [title], [description], [cateID], [sell_ID], [quantity]) VALUES (10, N'Happy Ending', N'https://hyt.r.worldssl.net/hinh-anh/hoa-cam-tay/4830/happy-ending.jpg', 900.0000, N'Bó hoa thiết kế phong cách sang trọng với nhiều loại hoa cao cấp giúp cô dâu thêm phần sang trọng và quý phái khi sánh vai cùng chú rể cùng nhau xây đắp hạnh phúc', N'Mẫu thiết kế gồm có:

- Hoa hồng phấn 

- Hoa hồng tím

- Sen đá

- Baby trắng

- Hoa lá phụ kiện kèm theo', 2, 2, 20)
INSERT [dbo].[product_HE153468_SE1606] ([id], [name], [image], [price], [title], [description], [cateID], [sell_ID], [quantity]) VALUES (11, N'Cung Đàn Tình Yêu', N'https://hyt.r.worldssl.net/hinh-anh/hoa-cam-tay/4828/cung-dan-tinh-yeu.jpg', 800.0000, N'Cung đàn tình yêu là bó hoa thiết kế với đa sắc màu lung linh, rực rỡ như cung bậc cảm xúc trong tình yêu cùng đích đến cuối cùng là cuộc sống hôn nhân - bến đỗ của hạnh phúc', N'Mẫu thiế kế gồm có:

- Hoa hồng tím

- Hoa hồng xanh

- Hoa cẩm chướng cam

- Hoa lá phụ kiện kèm theo', 2, 2, 30)
INSERT [dbo].[product_HE153468_SE1606] ([id], [name], [image], [price], [title], [description], [cateID], [sell_ID], [quantity]) VALUES (12, N'Tỏa Nắng', N'images/2507_toa-nang.png', 500.0000, N'Hoa tình yêu', N'Sản phẩm', NULL, 4, 50)
INSERT [dbo].[product_HE153468_SE1606] ([id], [name], [image], [price], [title], [description], [cateID], [sell_ID], [quantity]) VALUES (13, N'Hẹn yêu', N'https://hyt.r.worldssl.net/hinh-hoa-tuoi/hoa-sinh-nhat/11608_hen-yeu.jpg', 400.0000, N'Hẹn một mai ta yêu nhau, anh sẽ trao em một tình yêu đầy chân thành và lãng mạn. Dù cho có khó khăn, chúng ta hãy luôn bên cạnh nhau và cùng nhau vượt qua nhé.', N'Sản phẩm bao gồm:
Cát tường trắng: 6
Cúc calimero tím: 6
Hoa thạch thảo tím: 2
Hồng da: 7', 2, 2, 60)
INSERT [dbo].[product_HE153468_SE1606] ([id], [name], [image], [price], [title], [description], [cateID], [sell_ID], [quantity]) VALUES (14, N'Purple blooming', N'images/12347_purple-blooming.png', 450.0000, N'Hoa Chúc Mừng Sinh Nhật', N'Sản phẩm bao gồm:
Hoa thạch thảo tím: 2
Hồng da: 6
Hồng sen cồ: 10
Hồng tím cà: 6
Lá bạc : 2
Lan Moka tím: 10', 2, 1, 50)
INSERT [dbo].[product_HE153468_SE1606] ([id], [name], [image], [price], [title], [description], [cateID], [sell_ID], [quantity]) VALUES (15, N'Pretty Stars', N'images/11729_pretty-stars.png', 600.0000, N'"Pretty stars" bình hoa tựa như hàng trăm vì sao tuy nhỏ bé nhưng tràn đầy ánh sáng tươi vui, rạng rỡ. Hãy đặc biệt dành tặng những đóa hoa xinh xắn này cho bạn bè, người thân để khích lệ tinh thần của họ những lúc chán trường hay bế tắc, và không quên gửi kèm thêm những lời động viên chân thành nhất thì thật sự rất ý nghĩa đấy.', N'Sản Phẩm gồm 1 lãng hoa', 2, 4, 70)
INSERT [dbo].[product_HE153468_SE1606] ([id], [name], [image], [price], [title], [description], [cateID], [sell_ID], [quantity]) VALUES (16, N'Thanh xuân', N'https://hyt.r.worldssl.net/hinh-hoa-tuoi/hoa-sinh-nhat/10263_thanh-xuan.jpg', 600.0000, N'Thanh xuân như một tách trà. Quay qua, nhìn lại hết cả thanh xuân. Quả thật, thanh xuân là khoảng thời gian tràn đầy năng lượng và nhiệt huyết của mỗi con người. Đây là món quà vô giá mà cuộc sống ban tặng cho mỗi người chúng ta. Nhưng thanh xuân không ở lại mãi mãi, vậy nên khi còn trẻ hãy sống hết mình, làm những điều mình thích để có một thanh xuân đáng nhớ. Đơn giản nếu thích một ai đó, thì hãy thật mạnh dạn tỏ tình với người ấy nhé, chúng tôi sẽ giúp bạn!', N'Sản phẩm bao gồm:
Cúc Tana: 8
Cẩm chướng đơn xanh bơ : 15
Hồng trắng cồ: 17', 2, 3, 56)
INSERT [dbo].[product_HE153468_SE1606] ([id], [name], [image], [price], [title], [description], [cateID], [sell_ID], [quantity]) VALUES (17, N'Ươm nắng', N'images/10265_uom-nang.png', 500.0000, N'Lấy cảm hung từ màu nắng rực rỡ, thân thương của Sài Gòn, mẫu hoa mang tông màu vàng rực rỡ, tươi tắn cùng dáng vóc yêu kiều, tròn đầy. Giỏ hoa như một món quà đặc biệt, gửi chút nắng vàng ươm cho những người bạn của bạn để chúc mừng sinh nhật, chúc mừng thành công hay đơn giản chỉ là chúc một ngày tốt lành nhé.', N'Sản phẩm bao gồm:
Cẩm chướng đơn vàng : 10
Hồng trắng cồ: 11
Hướng dương : 3
Lan vũ nữ: 3
Mõm sói vàng: 10', 2, 1, 11)
INSERT [dbo].[product_HE153468_SE1606] ([id], [name], [image], [price], [title], [description], [cateID], [sell_ID], [quantity]) VALUES (18, N'Sắc màu', N'images/12346_sac-mau.png', 300.0000, N'Hoa Chúc Mừng Sinh Nhật', N'Sản phẩm bao gồm:
Cát tường trắng: 3
Hoa baby : 1
Hồng đỏ ớt : 9
Hồng đỏ sa : 5
Lá phụ khác: 3
Lan Moka vàng nến: 6', 2, 4, 12)
INSERT [dbo].[product_HE153468_SE1606] ([id], [name], [image], [price], [title], [description], [cateID], [sell_ID], [quantity]) VALUES (1001, N'Tình', N'images/10704_tinh.png', 350.0000, N'Bó "Tình" là sự kết hợp tinh tế của hoa hồng da cao cấp, xen kẽ với cẩm chướng, thạch thảo thể hiện một tình yêu đam mê và thủy chung, sâu sắc. Dành tặng người mà bạn yêu thương những lời nhắn nhủ thầm kín ẩn trong bó hoa sang trọng và ngọt ngào này nhé.', N'Sản phẩm bao gồm:
Cẩm chướng chùm hồng nhạt : 5
Cúc rossi trắng: 5
Hồng da: 5
Hồng da cồ: 5', 3, 1, 13)
INSERT [dbo].[product_HE153468_SE1606] ([id], [name], [image], [price], [title], [description], [cateID], [sell_ID], [quantity]) VALUES (1002, N'Me before you', N'images/4618_me-before-you.png', 550.0000, N'Lấy cảm hứng từ bộ phim tình cảm “Me before you”, mẫu hoa cùng tên mang đến thông điệp ý nghĩa về sức mạnh của tình yêu và cách mà tình yêu làm thay đổi mỗi người. Tặng bó hoa “Me before you’ cho một người nghĩa là ta rất thương yêu, quý trọng và đề cao họ.', N'Sản phẩm bao gồm:
Hồng đỏ sa : 30
Đinh lăng : 7', 3, 1, 14)
INSERT [dbo].[product_HE153468_SE1606] ([id], [name], [image], [price], [title], [description], [cateID], [sell_ID], [quantity]) VALUES (1003, N'Dear My Love', N'https://hyt.r.worldssl.net/hinh-hoa-tuoi/hoa-tinh-yeu/12665_dear-my-love.jpg', 400.0000, N'Hoa Tình Yêu', N'Sản phẩm bao gồm:
Hoa baby : 2
Hồng da: 15', 3, 3, 18)
INSERT [dbo].[product_HE153468_SE1606] ([id], [name], [image], [price], [title], [description], [cateID], [sell_ID], [quantity]) VALUES (1004, N'Tình yêu đầu', N'images/8830_tinh-yeu-dau.png', 550.0000, N'Nhằm đem đến thông điệp lãng mạn cho người yêu thương một tình yêu đầu trọn vẹn, các florist đã thiết kế giỏ hoa này với tông màu hồng nhạt này rất phù hợp để tặng cho những người đang yêu nhau theo xu hướng lãng mạ và nhẹ nhàng.', N'Sản phẩm bao gồm:
Cát tường trắng: 2
Hoa baby : 1
Hồng da: 12
Hồng trắng nhí: 8', 3, 1, 19)
INSERT [dbo].[product_HE153468_SE1606] ([id], [name], [image], [price], [title], [description], [cateID], [sell_ID], [quantity]) VALUES (1005, N'Thanh âm', N'images/12346_sac-mau.png', 700.0000, N'Giỏ hoa "Thanh âm" là sự kết hợp chủ đạo của hồng đỏ, cẩm chưởng đỏ, lan moakara đỏ và các hoa lá phụ khác. Mẫu cắm đã tôn vinh lên hết được ý nghĩa tượng trưng của hoa hồng đỏ sẵn có trong tình yêu kiêu sa và rực rỡ và không bao giờ phai nhạt.', N'Sản phẩm bao gồm:
Cẩm chướng đơn đỏ : 8
Chuỗi ngọc đỏ : 10
Hoa Sao tím: 1
Hồng đỏ sa : 16
Lan Moka đỏ: 5', 3, 4, 20)
INSERT [dbo].[product_HE153468_SE1606] ([id], [name], [image], [price], [title], [description], [cateID], [sell_ID], [quantity]) VALUES (1006, N'Lời yêu thương', N'images/11617_loi-yeu-thuong.png', 700.0000, N'Gửi đến người mà ta trân quý một giỏ hoa tươi thắm kèm những lời yêu thương chân thành chắc chắn sẽ là hành động mang đến cảm xúc ý nghĩa nhất đối với người nhận. Hoa tươi vốn dĩ luôn được chọn là món quà để chúng ta thay lời muốn nói từ trước đây và bây giờ cũng vậy, hoa sẽ luôn làm trọn nghĩa vụ cao cả ấy.', N'Sản Phẩm bao gồm 1 Bó Hoa', 3, 4, 23)
INSERT [dbo].[product_HE153468_SE1606] ([id], [name], [image], [price], [title], [description], [cateID], [sell_ID], [quantity]) VALUES (1007, N'Priceless Heart', N'images/10442_priceless-heart.png', 900.0000, N'Mẫu hoa được thiết kế với hình khối trái tim đặc biệt cùng màu sắc ngọt ngào sẽ giúp bạn dễ dàng chinh phục những cô nàng yêu màu hồng và đặc biệt hơn là yêu hoa. Dành tặng bình hoa này đến người bạn yêu thương thì chắc chắn sẽ khiến đối phương rung động không ngừng đấy.', N'Sản phẩm bao gồm:
Cúc Tana: 8
Cát tường hồng viền: 7
Hồng da: 20
Hồng da cồ: 15
Hồng sen mới: 15', 3, 4, 22)
INSERT [dbo].[product_HE153468_SE1606] ([id], [name], [image], [price], [title], [description], [cateID], [sell_ID], [quantity]) VALUES (1008, N'Love forever', N'images/12602_love-forever.png', 600.0000, N'Hoa Tình Yêu', N'Sản phẩm bao gồm:
Cát tường trắng: 3
Cúc mẫu đơn tím nhạt DL : 3
Hoa thạch thảo trắng: 1
Hồng tím cà: 12
Lá phụ khác: 5
Lan Moka tím: 7', 3, 1, 25)
INSERT [dbo].[product_HE153468_SE1606] ([id], [name], [image], [price], [title], [description], [cateID], [sell_ID], [quantity]) VALUES (1009, N'Gõ cửa trái tim', N'https://hyt.r.worldssl.net/hinh-hoa-tuoi/hoa-tinh-yeu/4568_go-cua-trai-tim.jpg', 900.0000, N'Trao cho nhau món quà thể hiện tình cảm là một cách bày tỏ tâm ý và đến gần với nhau hơn nữa. “Gõ cửa trái tim” là bó hoa đặc biệt như vậy, được thiết kế như một món quà giành cho những cặp đôi đang phải lòng nhau. Knock Knock Knock! Gõ từng nhịp vào trái tim từng để lắng nghe những lời chân tình, những lời yêu thương ngọt ngào nhất!', N'Sản phẩm bao gồm:
Hoa baby : 1
Hồng đỏ sa : 80', 3, 3, 26)
INSERT [dbo].[product_HE153468_SE1606] ([id], [name], [image], [price], [title], [description], [cateID], [sell_ID], [quantity]) VALUES (1010, N'Đại cát đại lợi', N'images/11574_dai-cat-dai-loi.png', 900.0000, N'Hoa Chúc Mừng', N'Sản phẩm bao gồm:
Cẩm chướng đơn hồng: 15
Cẩm chướng đơn viền tím : 10
Cúc ping pong hồng: 27
Hồng da: 85
Hồng da cồ: 20
Hồng sen cồ: 90
Hồng trắng nhí: 10
Lá bạc : 8
Lily hồng: 10', 3, 1, 34)
INSERT [dbo].[product_HE153468_SE1606] ([id], [name], [image], [price], [title], [description], [cateID], [sell_ID], [quantity]) VALUES (1011, N'Khởi đầu thuận lợi', N'https://hyt.r.worldssl.net/hinh-hoa-tuoi/hoa-chuc-mung/11571_khoi-dau-thuan-loi.jpg', 900.0000, N'Thành công là cả môt quá trình, một con đường mà bất kì ai cũng muốn được bước đi, nhưng mấy ai kiên trì và nhẫn nại để bước tới đến vinh quang của nó. Thành công đôi khi là mục tiêu nhưng đôi khi là môt chặng đường gian nan đòi hỏi ở người đi môt cái nhìn lạc quan và niềm tin mạnh mẽ để lên đỉnh thành công. Kệ hoa được tao ra với mong muốn giúp người nhận có một "khởi đầu thuận lợi"', N'Sản phẩm bao gồm:
Cúc mai xanh : 10
Dương xỉ pháp : 40
Hồng vàng ánh trăng : 40
Lá mật cật : 5
Lan Moka vàng nến: 33
Mõm sói vàng: 20
Môn xanh: 22
Đồng tiền vàng : 60', 4, 3, 35)
INSERT [dbo].[product_HE153468_SE1606] ([id], [name], [image], [price], [title], [description], [cateID], [sell_ID], [quantity]) VALUES (1012, N'Dẫn Lối Thành Công', N'https://hyt.r.worldssl.net/hinh-hoa-tuoi/hoa-chuc-mung/6912_dan-loi-thanh-cong.jpg', 900.0000, N'Thành công là một quá trình nỗ lực vượt qua chính bản thân mình. Chúng ta không ai lại không mong muốn được thành công. Khi bạn bắt đầu quyết tâm vào một việc gì đó thì hãy luôn tin tưởng mình và làm hết sức mình. Trí thức và kinh nghiệm cùng với bạn bè đồng nghiệp xung quang sẽ là đường dẫn lối thành công cho bạn', N'Sản phẩm bao gồm:
Hồ điệp vàng: 4
Hoa thiên điểu : 10
Hồng vàng ánh trăng : 80
Hồng vàng chùa : 50
Lan vũ nữ: 30', 4, 2, 40)
INSERT [dbo].[product_HE153468_SE1606] ([id], [name], [image], [price], [title], [description], [cateID], [sell_ID], [quantity]) VALUES (1013, N'Luxury vase 20', N'images/12672_luxury-vase.png', 800.0000, N'Hoa Chúc Mừng', N'Sản phẩm bao gồm:
Cúc mẫu đơn hồng nhạt NK : 10
Hoa baby : 3
Hoa hạnh phúc : 15
Hồng da: 10
Hồng đỏ sa : 20
Pink OHara: 10', 4, 4, 41)
INSERT [dbo].[product_HE153468_SE1606] ([id], [name], [image], [price], [title], [description], [cateID], [sell_ID], [quantity]) VALUES (1014, N'Khởi sắc thành công', N'images/11033_khoi-sac-thanh-cong.png', 950.0000, N'Được xem là màu may mắn, màu vàng rất thích hợp cho hỷ sự, lễ hội. Nó còn tượng trưng cho năng lượng Hỏa và sức mạnh... Kệ hoa chúc mừng được chúng tôi đầu tư một cách nghiêm túc vì chúng tôi luôn hiểu rằng đó là uy tín của khách hàng, của cả một doanh nghiệp. Vì vậy, chúng tôi luôn nhận được sự tin tưởng từ khách hàng, đặc biệt là các doanh nghiệp tin yêu và đặt thiết kế hoa chúc mừng phục vụ các dịp khai trương, khánh thành, tổ chức sự kiện và trong các dịp lễ quan trọng khác.', N'Sản phẩm bao gồm:
Cẩm chướng đơn viền cam : 20
Cúc Rossi cam orange: 10
Hồng da: 75
Hồng vàng mật ong : 30
Lá trầu bà : 3
Lá trúc nâu: 10
Lan vũ nữ: 20
Môn xanh: 11
Trúc bách hợp : 10', 4, 4, 42)
INSERT [dbo].[product_HE153468_SE1606] ([id], [name], [image], [price], [title], [description], [cateID], [sell_ID], [quantity]) VALUES (1015, N'Đại hồng phát', N'images/11030_dai-hong-phat.png', 990.0000, N'Được xem là màu may mắn, màu vàng rất thích hợp cho hỷ sự, lễ hội. Nó còn tượng trưng cho năng lượng Hỏa và sức mạnh... Kệ hoa chúc mừng được chúng tôi đầu tư một cách nghiêm túc vì chúng tôi luôn hiểu rằng đó là uy tín của khách hàng, của cả một doanh nghiệp. Vì vậy, chúng tôi luôn nhận được sự tin tưởng từ khách hàng, đặc biệt là các doanh nghiệp tin yêu và đặt thiết kế hoa chúc mừng phục vụ các dịp khai trương, khánh thành, tổ chức sự kiện và trong các dịp lễ quan trọng khác.', N'Sản phẩm bao gồm:
Hoa thiên điểu : 10
Hồng da: 60
Lá phụ khác: 30
Lan vũ nữ: 40
Môn hồng: 25
Đồng tiền vàng : 40', 4, 4, 44)
INSERT [dbo].[product_HE153468_SE1606] ([id], [name], [image], [price], [title], [description], [cateID], [sell_ID], [quantity]) VALUES (1016, N'Trường Tồn Mãi Mãi', N'images/5859_truong-ton-mai-mai.png', 800.0000, N'Tạo nên dấu ấn của mình trên thế giới này rất khó. Nếu dễ thì bất cứ ai cũng đã làm rồi. Nhưng nó không dễ. Nó đòi hỏi sự kiên nhẫn, bổn phận, và nó đi cùng nhiều thất bại dọc đường. Và khi bạn đã có những thành công nhất định thì phải cố gắng và nỗ lực hơn nữa để cho sự thành công bền vững và trường tồn.', N'Sản phẩm bao gồm:
Cẩm chướng đơn cam : 18
Cẩm chướng đơn xanh bơ : 12
Hoa Cúc Nút Xanh : 5
Hồng trứng gà : 26
Hồng vàng ánh trăng : 20
Hướng dương : 7
Lan Moka vàng nến: 10', 4, 1, 45)
INSERT [dbo].[product_HE153468_SE1606] ([id], [name], [image], [price], [title], [description], [cateID], [sell_ID], [quantity]) VALUES (1017, N'Thành Công Viên Mãn', N'images/5442_thanh-cong-vien-man.png', 750.0000, N'Với mỗi chúng ta thì thành công trong sự nghiệp của những người thân yêu luôn là niềm hạnh phúc trong ta. Sự nghiệp thăng tiến, thành công viên mãn, trường tồn mãi mãi đó chính là cảm hứng để làm nên kệ hoa này. Thích hợp tặng dịp khai trương, kỉ niệm thành lập công ty....', N'Sản phẩm bao gồm:
Cúc calimero xanh : 5
Hoa thiên điểu : 12
Hồng da: 25
Hồng vàng ánh trăng : 25
Lan vũ nữ: 15
Lily vàng thơm : 17
Môn xanh: 16', 4, 4, 46)
INSERT [dbo].[product_HE153468_SE1606] ([id], [name], [image], [price], [title], [description], [cateID], [sell_ID], [quantity]) VALUES (1018, N'Luxury Bloom', N'https://hyt.r.worldssl.net/hinh-hoa-tuoi/hoa-chuc-mung/11682_luxury-bloom.jpg', 999.9990, N'Hoa Chúc Mừng', N'Sản phẩm bao gồm:
Hồng ecuador explorer NK: 60
Lá bạc : 5', 4, 2, 45)
INSERT [dbo].[product_HE153468_SE1606] ([id], [name], [image], [price], [title], [description], [cateID], [sell_ID], [quantity]) VALUES (1021, N'Tỏa Nắng', N'images/2507_toa-nang.png', 500.0000, N'"Tỏa nắng" được thiết kế từ hoa hướng dương với ý nghĩa mang đến cho người nhận sức mạnh, may mắn và niềm tin.
', N'Sản phẩm bao gồm:
Hoa sao vàng: 5
Hướng dương : 6', 4, 4, 47)
INSERT [dbo].[product_HE153468_SE1606] ([id], [name], [image], [price], [title], [description], [cateID], [sell_ID], [quantity]) VALUES (1027, N'Tỏa Nắng Tặng Ny', N'images/2507_toa-nang.png', 500.0000, N'11111', N'11111', 4, 4, NULL)
INSERT [dbo].[product_HE153468_SE1606] ([id], [name], [image], [price], [title], [description], [cateID], [sell_ID], [quantity]) VALUES (2030, NULL, NULL, NULL, NULL, NULL, 4, NULL, NULL)
INSERT [dbo].[product_HE153468_SE1606] ([id], [name], [image], [price], [title], [description], [cateID], [sell_ID], [quantity]) VALUES (2031, NULL, NULL, NULL, NULL, NULL, 4, NULL, NULL)
SET IDENTITY_INSERT [dbo].[product_HE153468_SE1606] OFF
GO
ALTER TABLE [dbo].[InformationAccount_HE153468_SE1606]  WITH CHECK ADD  CONSTRAINT [FK_InformationAccount_Account] FOREIGN KEY([uid])
REFERENCES [dbo].[Account_HE153468_SE1606] ([uID])
GO
ALTER TABLE [dbo].[InformationAccount_HE153468_SE1606] CHECK CONSTRAINT [FK_InformationAccount_Account]
GO
ALTER TABLE [dbo].[Order_HE153468_SE1606]  WITH CHECK ADD  CONSTRAINT [FK_Order_HE153468_SE1606_Account_HE153468_SE1606] FOREIGN KEY([uid])
REFERENCES [dbo].[Account_HE153468_SE1606] ([uID])
GO
ALTER TABLE [dbo].[Order_HE153468_SE1606] CHECK CONSTRAINT [FK_Order_HE153468_SE1606_Account_HE153468_SE1606]
GO
ALTER TABLE [dbo].[OrderLine_HE153468_SE1606]  WITH CHECK ADD  CONSTRAINT [FK_OrderLine_HE153468_SE1606_Order_HE153468_SE1606] FOREIGN KEY([oid])
REFERENCES [dbo].[Order_HE153468_SE1606] ([id])
GO
ALTER TABLE [dbo].[OrderLine_HE153468_SE1606] CHECK CONSTRAINT [FK_OrderLine_HE153468_SE1606_Order_HE153468_SE1606]
GO
ALTER TABLE [dbo].[OrderLine_HE153468_SE1606]  WITH CHECK ADD  CONSTRAINT [FK_OrderLine_product] FOREIGN KEY([pid])
REFERENCES [dbo].[product_HE153468_SE1606] ([id])
GO
ALTER TABLE [dbo].[OrderLine_HE153468_SE1606] CHECK CONSTRAINT [FK_OrderLine_product]
GO
ALTER TABLE [dbo].[product_HE153468_SE1606]  WITH CHECK ADD  CONSTRAINT [FK_product_HE153468_SE1606_Category_HE153468_SE1606] FOREIGN KEY([cateID])
REFERENCES [dbo].[Category_HE153468_SE1606] ([cid])
GO
ALTER TABLE [dbo].[product_HE153468_SE1606] CHECK CONSTRAINT [FK_product_HE153468_SE1606_Category_HE153468_SE1606]
GO
