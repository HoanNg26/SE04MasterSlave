USE [STDMNGT]
GO

/****** Object:  Table [dbo].[sinhvien]    Script Date: 9/9/2017 10:46:54 AM ******/
--DROP TABLE [dbo].[sinhvien]
--GO

/****** Object:  Table [dbo].[sinhvien]    Script Date: 9/9/2017 10:46:54 AM ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[sinhvien](
	[mssv] [nvarchar](50) NOT NULL,
	[hoten] [nvarchar](50) NOT NULL ,
	[ngaysinh] [datetime] NOT NULL,
	[diachi] [nvarchar](250) NULL,
	[email] [nvarchar](250) NULL,
	[makhoa] [int] NOT NULL,
 CONSTRAINT [PK_sinhvien] PRIMARY KEY CLUSTERED 
(
	[mssv] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO


