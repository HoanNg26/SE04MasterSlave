USE [STDMNGT]
GO

/****** Object:  Table [dbo].[khoa]    Script Date: 9/9/2017 10:42:23 AM ******/
--DROP TABLE [dbo].[khoa]
--GO

/****** Object:  Table [dbo].[khoa]    Script Date: 9/9/2017 10:42:23 AM ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[khoa](
	[makhoa] [int] NOT NULL,
	[tenkhoa] [nvarchar](100) NOT NULL,
 CONSTRAINT [PK_khoa] PRIMARY KEY CLUSTERED 
(
	[makhoa] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO


