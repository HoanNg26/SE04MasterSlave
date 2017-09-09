USE master;  
GO  
IF DB_ID (N'STDMNGT') IS NOT NULL  
DROP DATABASE STDMNGT;  
GO  
CREATE DATABASE STDMNGT ;
--COLLATE Vietnamese_CI_AS;  
GO  

--CREATE DATABASE STDMNGT  
--COLLATE Vietnamese_CI_AS;  
--GO  

--Verify the collation setting.  
SELECT name, collation_name  
FROM sys.databases  
WHERE name = N'STDMNGT';  
GO  