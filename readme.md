# springboot 강좌
* 19 스프링 AOP : 프록시 기반 AOP
	* AOP 주요 개념 정리
		* Aspect: 묶은 모듈 (Advice, PointCut) 포함
		* Advice: 해야할 일들
		* Pointcut: 어디에 적용해야 하는 지 정보(A, B, C)
			* Pointcut 예시: Class A의 메서드 B 를 호출 할때 Class C의 메서드 foo를 호출할 때만 이 Advice를 적용 하겠다라고 알려주는 것
		* Target: 적용이 되는 대상(Class A, B, C)
		* Join Point: 합류 지점
			* 메서드 실행 시점에 끼어들 수 있는 지점 ex) 생성자 호출직전, 생성자 호출이후, 필드에 접근하기전, 필드에서 값을 가져갔을 때 등의 여러가지 합류 지점

    * 프록시 패턴
        * 매번 프록시 클래스를 작성해야 하는가?
        * 여러 클래스 여러 매소드에 적용하려면
        * 객체 관계들도 복잡

    * 애노테이션 기반의 스프링 @AOP
        * 의존성 추가
```
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-aop</artifactId>
</dependency>
```
   * 애스팩트 정의
        * @Aspect
        * 빈으로 등록해야 하니까 (컴포넌트 스캔을 사용한다면) @Component도 추가.
   * 포인트컷 정의
        * @Pointcut(표현식)
        * 주요 표현식
            * execution
            * @annotation
            * bean
        * 포인트컷 조합
            * &&, ||, !
   * 어드바이스 정의
        * @Before
        * @AfterReturning
        * @AfterThrowing
        * @Around
        
   * 참고
https://docs.spring.io/spring/docs/current/spring-framework-reference/core.html#aoppointcuts