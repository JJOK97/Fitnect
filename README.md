## 📺 Preview

[![Preview](https://github.com/JJOK97/Fitnect/assets/133585698/80fbe409-b7b1-4d0b-bf4f-c56f8c9c0191)](https://github.com/JJOK97/Fitnect/assets/133585698/80fbe409-b7b1-4d0b-bf4f-c56f8c9c0191)

<br>

## 목차

##### 1. [개발 목적](#-개발-목적)
##### 2. [Fitnect 주요 기능](#-fitnect-주요-기능)
##### 3. [주요 기술 스택](#-주요-기술-스택)
##### 4. [주요 작업](#-주요-작업)
##### 5. [추가 리팩토링](#-추가-리팩토링)
##### 6. [기타 사항](#-기타-사항)

<br>

## 📖 개발 목적

Fitnect 프로젝트는 피트니스와 커넥트의 합성어로, 위치 기반 운동 시설 종합 정보 및 예약/결제 서비스를 제공하는 것을 목표로 합니다. 

사용자가 원하는 운동 시설을 쉽게 찾고 예약할 수 있도록 하며, 위치 기반으로 가장 가까운 시설을 찾아주는 기능을 구현합니다.

<br>

## 🚀 Fitnect 주요 기능

### 주요 기능

- **시설 검색 및 예약**: 사용자가 원하는 시설을 검색하고 예약할 수 있는 기능
- **위치 기반 검색**: 사용자의 현재 위치를 기반으로 가까운 운동 시설을 추천
- **거리 계산 및 길찾기**: 사용자와 주요 시설 간의 거리 계산 및 길찾기 기능
- **리뷰 및 평점**: 시설에 대한 리뷰 및 평점을 남길 수 있는 기능
- **결제 시스템**: 안전하고 간편한 결제 시스템 제공

<br>

### 주요 비즈니스 로직

- 사용자와 시설 간의 거리 계산 및 길찾기
- 사용자의 선호도와 위치를 기반으로 한 맞춤형 시설 추천

<br>

## 📚 주요 기술 스택

- **설계 패턴**: <img src="https://img.shields.io/badge/RESTful%20API-6DB33F?style=for-the-badge&logo=api&logoColor=white" style="height: 25px; margin: 2px">
- **프로그래밍 언어**: <img src="https://img.shields.io/badge/java-007396?style=for-the-badge&logo=java&logoColor=white">
- **프레임워크**: <img src="https://img.shields.io/badge/springboot-6DB33F?style=for-the-badge&logo=springboot&logoColor=white " style="height: 25px; margin: 2px"> <img src="https://img.shields.io/badge/vue.js-4FC08D?style=for-the-badge&logo=vue.js&logoColor=white" style="height: 25px; margin: 2px">
- **데이터베이스**: <img src="https://img.shields.io/badge/mysql-4479A1?style=for-the-badge&logo=mysql&logoColor=white" style="height: 25px; margin: 2px">
- **지도 API**: <img src="https://img.shields.io/badge/tmap-FF0000?style=for-the-badge&logo=tmap&logoColor=white" style="height: 25px; margin: 2px"> <img src="https://img.shields.io/badge/kakaomap-FFCD00?style=for-the-badge&logo=kakaomap&logoColor=white" style="height: 25px; margin: 2px">

<br>

## 🔧 주요 작업

### 프론트엔드

#### 1. 사용자 인터페이스 설계

> Vue.js와 HTML, CSS를 활용하여 직관적이고 사용자 친화적인 UX/UI를 갖춘 웹 인터페이스로 개발

1. **직관적인 디자인**: 사용자 경험을 극대화하기 위해 간결하고 직관적인 디자인 원칙을 적용

    - **개발 방법**: Vue.js의 컴포넌트 기반 아키텍처를 활용하여 재사용 가능한 UI 컴포넌트를 개발하고, CSS Flexbox를 이용하여 반응형 디자인을 구현

**구체적인 성과**

- **CSS Flexbox를 활용하여 반응형 디자인을 구현하면서 다양한 화면 크기와 해상도에서 일관된 UI를 제공하는 방법을 배울 수 있었음**

<br>

#### 2. 반응형 디자인 구현

> 화면 크기 변화에 따른 반응형 레이아웃 제공

1. **반응형 레이아웃 구현**: 다양한 화면 크기에서 일관된 UX를 제공하기 위해 반응형 레이아웃을 구현

    - **개발 방법**: CSS Media Queries를 사용하여 다양한 화면 크기에서 레이아웃이 적절하게 조정되도록 구현

**구체적인 성과**

- **CSS Media Queries를 사용하여 다양한 화면 크기에서 일관된 UX를 제공하는 방법을 익힘**

<br>

## 🔄 추가 리팩토링


<br>

## 👥 기타 사항

### 소규모 XP 개발 경험

- **개발 팀 구성**: 2명
- **개발 기간**: 24.05.16 ~ 24.5.23 ( 6일 )
- **개발 방법론**: XP 활용

짧은 기간 동안 효율적으로 프로젝트를 진행하기 위해 Extreme Programming 방식을 도입하여 빠르게 성공적으로 프로젝트를 완료했습니다. 

매일매일 스프린트와 데일리 스크럼 미팅을 통해 빠른 피드백과 지속적인 개선을 이루었고, 변화하는 요구사항에 유연하게 대응했습니다.

- **구체적인 성과**
    - **효율적인 팀워크**: XP의 페어 프로그래밍과 지속적인 소통을 통해 팀원 간의 협업을 극대화하여 프로젝트 진행 상황을 신속하게 조정할 수 있었습니다.
    - **문제 해결 능력 향상**: 짧은 시간 내에 다양한 문제를 해결하며 문제 해결 능력을 크게 향상시킬 수 있었고, 빠르게 의사결정을 내리는 경험을 쌓았습니다.
    - **지속적인 리팩토링**: 지속적인 리팩토링을 통해 코드의 가독성과 효율성을 높였고, 이는 서로의 코드를 이해하는데 있어 큰 역할을 하였고 프로젝트 성공에 중요한 역할을 했습니다.
