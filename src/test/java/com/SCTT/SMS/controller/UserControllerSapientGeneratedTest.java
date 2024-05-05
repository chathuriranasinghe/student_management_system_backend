package com.SCTT.SMS.controller;

import org.junit.jupiter.api.Timeout;
import org.mockito.InjectMocks;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import java.util.List;
import com.SCTT.SMS.dto.StudentDTO;
import com.SCTT.SMS.service.StudentService;
import java.util.ArrayList;
import org.mockito.MockitoAnnotations;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class UserControllerSapientGeneratedTest {

    private final StudentService studentServiceMock = mock(StudentService.class, "studentService");

    private AutoCloseable autoCloseableMocks;

    @InjectMocks()
    private UserController target;

    @AfterEach()
    public void afterTest() throws Exception {
        if (autoCloseableMocks != null)
            autoCloseableMocks.close();
    }

    //Sapient generated method id: ${b16cf963-bd08-3c59-96d4-1049f90b3668}, hash: 6A3DCBF6E66B4F8A8699A09CA2173F9D
    @Test()
    void getStudentTest() {
        //Arrange Statement(s)
        target = new UserController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        List<StudentDTO> studentDTOList = new ArrayList<>();
        doReturn(studentDTOList).when(studentServiceMock).getAllStudents();
        
        //Act Statement(s)
        List<StudentDTO> result = target.getStudent();
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(studentDTOList));
            verify(studentServiceMock).getAllStudents();
        });
    }

    //Sapient generated method id: ${2684c131-d50a-3ac9-9dab-2a194c04848c}, hash: 29482FA74BADF90576F92A5325F6BFFA
    @Test()
    void saveStudentTest() {
        //Arrange Statement(s)
        target = new UserController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        StudentDTO studentDTOMock = mock(StudentDTO.class);
        StudentDTO studentDTOMock2 = mock(StudentDTO.class);
        doReturn(studentDTOMock).when(studentServiceMock).saveStudent(studentDTOMock2);
        
        //Act Statement(s)
        StudentDTO result = target.saveStudent(studentDTOMock2);
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(studentDTOMock));
            verify(studentServiceMock).saveStudent(studentDTOMock2);
        });
    }

    //Sapient generated method id: ${e7caf34e-ce5b-31a9-94d0-abd5253c6d65}, hash: 9DDBD61A26526202AE3036FD45F05D97
    @Test()
    void updateStudentTest() {
        //Arrange Statement(s)
        target = new UserController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        StudentDTO studentDTOMock = mock(StudentDTO.class);
        StudentDTO studentDTOMock2 = mock(StudentDTO.class);
        doReturn(studentDTOMock).when(studentServiceMock).updateStudent(studentDTOMock2);
        
        //Act Statement(s)
        StudentDTO result = target.updateStudent(studentDTOMock2);
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(studentDTOMock));
            verify(studentServiceMock).updateStudent(studentDTOMock2);
        });
    }

    //Sapient generated method id: ${3500c7a6-9ab5-34eb-94af-eba17043fbe8}, hash: 487ED335F4F3FA769131D8CDFFE4D60E
    @Test()
    void deleteStudentWhenStudentServiceDeleteStudentStudentDTO() {
        /* Branches:
         * (studentService.deleteStudent(studentDTO)) : true
         */
         //Arrange Statement(s)
        target = new UserController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        StudentDTO studentDTOMock = mock(StudentDTO.class);
        doReturn(true).when(studentServiceMock).deleteStudent(studentDTOMock);
        
        //Act Statement(s)
        boolean result = target.deleteStudent(studentDTOMock);
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(Boolean.TRUE));
            verify(studentServiceMock).deleteStudent(studentDTOMock);
        });
    }

    //Sapient generated method id: ${05e36f13-4f07-38a2-97e2-0624c9c8c0f9}, hash: 4CC42304DDEABC833311AB3CF31DE29D
    @Test()
    void deleteStudentWhenStudentServiceNotDeleteStudentStudentDTO() {
        /* Branches:
         * (studentService.deleteStudent(studentDTO)) : false
         */
         //Arrange Statement(s)
        target = new UserController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        StudentDTO studentDTOMock = mock(StudentDTO.class);
        doReturn(false).when(studentServiceMock).deleteStudent(studentDTOMock);
        
        //Act Statement(s)
        boolean result = target.deleteStudent(studentDTOMock);
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(Boolean.FALSE));
            verify(studentServiceMock).deleteStudent(studentDTOMock);
        });
    }

    //Sapient generated method id: ${971a35b9-51d7-3ea1-aed2-fe36ba4c77c2}, hash: EEFDCAFBD68AA994EC8DA377A54A0384
    @Test()
    void getStudentByIndexNoTest() {
        //Arrange Statement(s)
        target = new UserController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        StudentDTO studentDTOMock = mock(StudentDTO.class);
        doReturn(studentDTOMock).when(studentServiceMock).getStudentByIndexNo("studentIndex1");
        
        //Act Statement(s)
        StudentDTO result = target.getStudentByIndexNo("studentIndex1");
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(studentDTOMock));
            verify(studentServiceMock).getStudentByIndexNo("studentIndex1");
        });
    }
}
