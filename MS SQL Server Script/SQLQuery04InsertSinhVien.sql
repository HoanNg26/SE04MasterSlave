USE [STDMNGT]
GO


INSERT INTO [dbo].[sinhvien]
           ([mssv]
           ,[hoten]
		   ,[ngaysinh]
           ,[diachi]
           ,[email]
           ,[makhoa])
     VALUES
           ('1234567'
           ,N'NGUYỄN VĂN AN'
		   ,CONVERT(datetime,'1996-06-26 9:30:00.000')
           ,N'123 CỘNG HÒA QUẬN TÂN BÌNH'
           ,'ABC@GMAIL.COM'
           ,1)
GO

INSERT INTO [dbo].[sinhvien]
           ([mssv]
           ,[hoten]
		   ,[ngaysinh]
           ,[diachi]
           ,[email]
           ,[makhoa])
     VALUES
           ('2737737'
           ,N'NGUYỄN THỊ BÌNH'
		   ,CONVERT(datetime,'1996-06-26 9:30:00.000')
           ,N'123 CỘNG HÒA QUẬN TÂN BÌNH'
           ,'ABC@GMAIL.COM'
           ,2)
GO

INSERT INTO [dbo].[sinhvien]
           ([mssv]
           ,[hoten]
		   ,[ngaysinh]
           ,[diachi]
           ,[email]
           ,[makhoa])
     VALUES
           ('57983837'
           ,N'CAO VĂN SOÁI'
		   ,CONVERT(datetime,'1996-06-26 9:30:00.000')
           ,N'123 CỘNG HÒA QUẬN TÂN BÌNH'
           ,'ABC@GMAIL.COM'
           ,3)
GO
