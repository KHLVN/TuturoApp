USE [master]
GO
/****** Object:  Database [tuturo_db]    Script Date: 11/19/2023 3:57:22 PM ******/
CREATE DATABASE [tuturo_db]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'tuturo_db', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL16.SQLEXPRESS\MSSQL\DATA\tuturo_db.mdf' , SIZE = 8192KB , MAXSIZE = UNLIMITED, FILEGROWTH = 65536KB )
 LOG ON 
( NAME = N'tuturo_db_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL16.SQLEXPRESS\MSSQL\DATA\tuturo_db_log.ldf' , SIZE = 8192KB , MAXSIZE = 2048GB , FILEGROWTH = 65536KB )
 WITH CATALOG_COLLATION = DATABASE_DEFAULT
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [tuturo_db].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [tuturo_db] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [tuturo_db] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [tuturo_db] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [tuturo_db] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [tuturo_db] SET ARITHABORT OFF 
GO
ALTER DATABASE [tuturo_db] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [tuturo_db] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [tuturo_db] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [tuturo_db] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [tuturo_db] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [tuturo_db] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [tuturo_db] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [tuturo_db] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [tuturo_db] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [tuturo_db] SET  DISABLE_BROKER 
GO
ALTER DATABASE [tuturo_db] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [tuturo_db] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [tuturo_db] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [tuturo_db] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [tuturo_db] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [tuturo_db] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [tuturo_db] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [tuturo_db] SET RECOVERY SIMPLE 
GO
ALTER DATABASE [tuturo_db] SET  MULTI_USER 
GO
ALTER DATABASE [tuturo_db] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [tuturo_db] SET DB_CHAINING OFF 
GO
ALTER DATABASE [tuturo_db] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [tuturo_db] SET TARGET_RECOVERY_TIME = 60 SECONDS 
GO
ALTER DATABASE [tuturo_db] SET DELAYED_DURABILITY = DISABLED 
GO
ALTER DATABASE [tuturo_db] SET ACCELERATED_DATABASE_RECOVERY = OFF  
GO
ALTER DATABASE [tuturo_db] SET QUERY_STORE = ON
GO
ALTER DATABASE [tuturo_db] SET QUERY_STORE (OPERATION_MODE = READ_WRITE, CLEANUP_POLICY = (STALE_QUERY_THRESHOLD_DAYS = 30), DATA_FLUSH_INTERVAL_SECONDS = 900, INTERVAL_LENGTH_MINUTES = 60, MAX_STORAGE_SIZE_MB = 1000, QUERY_CAPTURE_MODE = AUTO, SIZE_BASED_CLEANUP_MODE = AUTO, MAX_PLANS_PER_QUERY = 200, WAIT_STATS_CAPTURE_MODE = ON)
GO
USE [tuturo_db]
GO
/****** Object:  Table [dbo].[Accounts]    Script Date: 11/19/2023 3:57:22 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Accounts](
	[account_id] [int] IDENTITY(1,1) NOT NULL,
	[user_id] [int] NULL,
	[real_name] [varchar](50) NOT NULL,
	[username] [varchar](50) NOT NULL,
	[account_type] [varchar](50) NOT NULL,
	[contact_number] [varchar](50) NOT NULL,
	[email] [varchar](50) NOT NULL,
	[password] [varchar](50) NOT NULL,
 CONSTRAINT [PK_Accounts] PRIMARY KEY CLUSTERED 
(
	[account_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Session]    Script Date: 11/19/2023 3:57:22 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Session](
	[session_id] [int] IDENTITY(1,1) NOT NULL,
	[user_id] [int] NOT NULL,
	[subject_id] [int] NOT NULL,
 CONSTRAINT [PK_Session] PRIMARY KEY CLUSTERED 
(
	[session_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Session_schedule]    Script Date: 11/19/2023 3:57:22 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Session_schedule](
	[session_schedule_id] [int] IDENTITY(1,1) NOT NULL,
	[session_id] [int] NOT NULL,
	[session_date] [date] NOT NULL,
	[session_time] [time](7) NOT NULL,
 CONSTRAINT [PK_Session_schedule] PRIMARY KEY CLUSTERED 
(
	[session_schedule_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Student]    Script Date: 11/19/2023 3:57:22 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Student](
	[student_id] [int] IDENTITY(1,1) NOT NULL,
	[student_name] [varchar](50) NOT NULL,
	[username] [varchar](50) NOT NULL,
	[contact_number] [varchar](50) NULL,
	[email] [varchar](50) NULL,
 CONSTRAINT [PK_Student] PRIMARY KEY CLUSTERED 
(
	[student_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Student_preference]    Script Date: 11/19/2023 3:57:22 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Student_preference](
	[student_id] [int] IDENTITY(1,1) NOT NULL,
	[subject_id] [int] NOT NULL,
	[account_type] [varchar](50) NOT NULL,
 CONSTRAINT [PK_Student_preference] PRIMARY KEY CLUSTERED 
(
	[student_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Subject]    Script Date: 11/19/2023 3:57:22 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Subject](
	[subject_id] [int] IDENTITY(1,1) NOT NULL,
	[subject_name] [varchar](50) NOT NULL,
	[subject_category] [varchar](50) NOT NULL,
 CONSTRAINT [PK_Subject] PRIMARY KEY CLUSTERED 
(
	[subject_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Tutor]    Script Date: 11/19/2023 3:57:22 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Tutor](
	[tutor_id] [int] IDENTITY(1,1) NOT NULL,
	[tutor_name] [varchar](50) NOT NULL,
	[username] [varchar](50) NOT NULL,
	[contact_number] [varchar](50) NULL,
	[email] [varchar](50) NULL,
 CONSTRAINT [PK_Tutor] PRIMARY KEY CLUSTERED 
(
	[tutor_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Tutor_skills]    Script Date: 11/19/2023 3:57:22 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Tutor_skills](
	[tutor_skills] [varchar](50) NOT NULL,
	[tutor_description] [varchar](50) NOT NULL
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Tutor_specialization]    Script Date: 11/19/2023 3:57:22 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Tutor_specialization](
	[tutor_id] [int] IDENTITY(1,1) NOT NULL,
	[subject_id] [int] NOT NULL,
	[tutor_skills] [varchar](50) NOT NULL,
	[account_type] [varchar](50) NOT NULL,
 CONSTRAINT [PK_Tutor_specialization] PRIMARY KEY CLUSTERED 
(
	[tutor_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
ALTER TABLE [dbo].[Accounts]  WITH CHECK ADD  CONSTRAINT [FK_Accounts_Student_preference] FOREIGN KEY([user_id])
REFERENCES [dbo].[Student_preference] ([student_id])
GO
ALTER TABLE [dbo].[Accounts] CHECK CONSTRAINT [FK_Accounts_Student_preference]
GO
ALTER TABLE [dbo].[Accounts]  WITH CHECK ADD  CONSTRAINT [FK_Accounts_Tutor_specialization] FOREIGN KEY([user_id])
REFERENCES [dbo].[Tutor_specialization] ([tutor_id])
GO
ALTER TABLE [dbo].[Accounts] CHECK CONSTRAINT [FK_Accounts_Tutor_specialization]
GO
ALTER TABLE [dbo].[Session]  WITH CHECK ADD  CONSTRAINT [FK_Session_Subject] FOREIGN KEY([subject_id])
REFERENCES [dbo].[Subject] ([subject_id])
GO
ALTER TABLE [dbo].[Session] CHECK CONSTRAINT [FK_Session_Subject]
GO
ALTER TABLE [dbo].[Session_schedule]  WITH CHECK ADD  CONSTRAINT [FK_Session_schedule_Session] FOREIGN KEY([session_id])
REFERENCES [dbo].[Session] ([session_id])
GO
ALTER TABLE [dbo].[Session_schedule] CHECK CONSTRAINT [FK_Session_schedule_Session]
GO
ALTER TABLE [dbo].[Student_preference]  WITH CHECK ADD  CONSTRAINT [FK_Student_preference_Subject] FOREIGN KEY([subject_id])
REFERENCES [dbo].[Subject] ([subject_id])
GO
ALTER TABLE [dbo].[Student_preference] CHECK CONSTRAINT [FK_Student_preference_Subject]
GO
ALTER TABLE [dbo].[Tutor_specialization]  WITH CHECK ADD  CONSTRAINT [FK_Tutor_specialization_Subject] FOREIGN KEY([subject_id])
REFERENCES [dbo].[Subject] ([subject_id])
GO
ALTER TABLE [dbo].[Tutor_specialization] CHECK CONSTRAINT [FK_Tutor_specialization_Subject]
GO
USE [master]
GO
ALTER DATABASE [tuturo_db] SET  READ_WRITE 
GO
