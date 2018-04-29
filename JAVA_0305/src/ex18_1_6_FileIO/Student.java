package ex18_1_6_FileIO;

public class Student { 
    String name; 
    int  kor, eng,  math;
    static int korTotal, engTotal, mathTotal;    
    Student(String name,int kor, int eng, int math){
       this.name = name;
       this.kor = kor;
       this.eng = eng;
       this.math = math;
       //Student 생성때 마다 과목별 총점 구합니다.
       korTotal += kor;
       engTotal += eng;
       mathTotal += math;
    }
    
     int getTotal() {
        return kor + eng + math; 
     }
     
     float getAverage(){ 
        return (getTotal() / 3f);
     }
     
    
}