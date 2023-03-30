# 디자인 패턴

참고자료:  
스프링 입문을 위한 자바 객체 지향의 원리와 이해  
토비의 스프링 1,2


템플릿 메소드 패턴(Template Method Pattern)
  - 상속을 통해 슈퍼 클래스의 기능 확장
  - 슈퍼클래스: 변하지 않는 고정 기능
  - 서브클래스: 변경 및 확장 기능
  
  - 슈퍼클래스 : 추상메소드 또는 protected 메소드 선언(hook 메소드), 이를 사용하는 템플릿 메소드 선언
  - 서브클래스: 해당 메소드 재정의
  
팩토리 메소드 패턴(Factory Method Pattern)
  - 상속을 통해 기능 확장
  - 슈퍼클래스: 서브클래스에서 구현한 메소드의 리턴을 통해 객체(주로 인터페이스 타입)를 가져와 사용
  - 서브클래스: 객체 생성 방법과 클래스를 결정하는 팩토리 메소드 선언
  - 객체 생성 방법을 슈퍼 클래스 코드에서 분리시킨다
  
전략 패턴(Strategy Pattern)
  - 개방 폐쇄 원칙 실현에 가장 적합
  - 자신의 기능 맥락(context)에서 수정 가능성이 있는 알고리즘을 인터페이스를 통해 외부로 분리하고
  이를 구현한 구체적인 알고리즘(독립적인 책임으로 분리가 가능한 기능) 클래스를 필요에 따라 바꿔서 사용
  
  
# 객체 지향 설계 원칙(SQLID)
  - SRP(The Single Responsibility Principle) : 단일 책임 원칙
  - OCP(The Open Closed Principle) : 개방 폐쇄 원칙
  - LSP(The Liskov Substitution Principle) : 리스코프 치환 원칙
  - ISP(The Interface Segregation Principle) : 인터페이스 분리 원칙
  - DIP(The Dependency Inversion Principle) : 의존 관계 역전 원칙
  
개방 폐쇄 원칙(OCP)
  - 높은 응집도(수정이 일어날떄 해당 모듈에서 수정되는 부분이 크다)
  - 낮은 결합도(책임과 관심사가 다른 모듈과 낮은 결합을 가진다, 하나의 객체 변화에 다른 객체들이 영향을 덜 받는것)
  
