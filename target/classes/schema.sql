DROP TABLE IF EXISTS TBL_EMPLOYEES;
  
CREATE TABLE Courses (
  mCourseId INT AUTO_INCREMENT  PRIMARY KEY,
  mCourseDescription VARCHAR(250) NOT NULL,
  mCourseTutor VARCHAR(250) NOT NULL,
  mCoursePrice DOUBLE DEFAULT NULL,
  mCourseStartDate VARCHAR(20) NOT NULL,
  mCourseEndDate VARCHAR(20) NOT NULL
);