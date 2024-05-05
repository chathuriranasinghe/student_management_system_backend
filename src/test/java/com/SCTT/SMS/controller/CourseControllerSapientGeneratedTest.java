package com.SCTT.SMS.controller;

import org.junit.jupiter.api.Timeout;
import org.mockito.InjectMocks;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import java.util.List;
import com.SCTT.SMS.dto.CourseDTO;
import java.util.ArrayList;
import org.mockito.MockitoAnnotations;
import com.SCTT.SMS.service.CourseService;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class CourseControllerSapientGeneratedTest {

    private final CourseService courseServiceMock = mock(CourseService.class, "courseService");

    private AutoCloseable autoCloseableMocks;

    @InjectMocks()
    private CourseController target;

    @AfterEach()
    public void afterTest() throws Exception {
        if (autoCloseableMocks != null)
            autoCloseableMocks.close();
    }

    //Sapient generated method id: ${fcdc8372-fbc7-30d5-9107-6d8aec028a2e}, hash: 01F8CF52FF7250645F65AAA1F0C0B31B
    @Test()
    void getCourseTest() {
        //Arrange Statement(s)
        target = new CourseController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        List<CourseDTO> courseDTOList = new ArrayList<>();
        doReturn(courseDTOList).when(courseServiceMock).getAllCourses();
        
        //Act Statement(s)
        List<CourseDTO> result = target.getCourse();
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(courseDTOList));
            verify(courseServiceMock).getAllCourses();
        });
    }

    //Sapient generated method id: ${79460233-83cf-3d23-b1a5-33a0e06ec78c}, hash: 94D88C6A4B5CA72330A8966996CB6DC6
    @Test()
    void saveCourseTest() {
        //Arrange Statement(s)
        target = new CourseController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        CourseDTO courseDTOMock = mock(CourseDTO.class);
        CourseDTO courseDTOMock2 = mock(CourseDTO.class);
        doReturn(courseDTOMock).when(courseServiceMock).saveCourse(courseDTOMock2);
        
        //Act Statement(s)
        CourseDTO result = target.saveCourse(courseDTOMock2);
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(courseDTOMock));
            verify(courseServiceMock).saveCourse(courseDTOMock2);
        });
    }

    //Sapient generated method id: ${330c65d9-c121-333c-9889-48d4a6e83aee}, hash: D503D7960BC9A5369194B612E69B547C
    @Test()
    void updateCourseTest() {
        //Arrange Statement(s)
        target = new CourseController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        CourseDTO courseDTOMock = mock(CourseDTO.class);
        CourseDTO courseDTOMock2 = mock(CourseDTO.class);
        doReturn(courseDTOMock).when(courseServiceMock).updateCourse(courseDTOMock2);
        
        //Act Statement(s)
        CourseDTO result = target.updateCourse(courseDTOMock2);
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(courseDTOMock));
            verify(courseServiceMock).updateCourse(courseDTOMock2);
        });
    }

    //Sapient generated method id: ${8d07e2d5-d3f5-3f8b-95b6-90c05f6d58bd}, hash: 673798289C2D5FA908A332336AA1C3B5
    @Test()
    void deleteCourseWhenCourseServiceDeleteCourseCourseDTO() {
        /* Branches:
         * (courseService.deleteCourse(courseDTO)) : true
         */
         //Arrange Statement(s)
        target = new CourseController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        CourseDTO courseDTOMock = mock(CourseDTO.class);
        doReturn(true).when(courseServiceMock).deleteCourse(courseDTOMock);
        
        //Act Statement(s)
        boolean result = target.deleteCourse(courseDTOMock);
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(Boolean.TRUE));
            verify(courseServiceMock).deleteCourse(courseDTOMock);
        });
    }

    //Sapient generated method id: ${7678bbcf-6a6f-3efb-a974-e1fdef3bfa56}, hash: E2AA0C0F420E5AE57B01DA0305E4200C
    @Test()
    void deleteCourseWhenCourseServiceNotDeleteCourseCourseDTO() {
        /* Branches:
         * (courseService.deleteCourse(courseDTO)) : false
         */
         //Arrange Statement(s)
        target = new CourseController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        CourseDTO courseDTOMock = mock(CourseDTO.class);
        doReturn(false).when(courseServiceMock).deleteCourse(courseDTOMock);
        
        //Act Statement(s)
        boolean result = target.deleteCourse(courseDTOMock);
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(Boolean.FALSE));
            verify(courseServiceMock).deleteCourse(courseDTOMock);
        });
    }

    //Sapient generated method id: ${79b928f4-e74e-3885-b55f-70d56ab50cea}, hash: 3FCF3437EDFCC9EB57BB76EEBA9498C8
    @Test()
    void getCourseByIndexNoTest() {
        //Arrange Statement(s)
        target = new CourseController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        CourseDTO courseDTOMock = mock(CourseDTO.class);
        doReturn(courseDTOMock).when(courseServiceMock).getCourseByIndexNo("studentIndex1");
        
        //Act Statement(s)
        CourseDTO result = target.getCourseByIndexNo("studentIndex1");
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(courseDTOMock));
            verify(courseServiceMock).getCourseByIndexNo("studentIndex1");
        });
    }
}
