[![LinkedIn](https://img.shields.io/badge/LinkedIn-0077B5?style=flat&logo=linkedin&logoColor=white)](https://linkedin.com/in/chanukyagattu)
[![Resume](https://img.shields.io/badge/Resume-4285F4?style=flat&logo=googledocs&logoColor=white)](https://chanukyagattu.github.io/portfolio/CHANUKYA_GATTU_RESUME.pdf)
[![GitHub](https://img.shields.io/badge/GitHub-181717?style=flat&logo=github&logoColor=white)](https://github.com/chanukyagattu)
[![Email](https://img.shields.io/badge/Email-D14836?style=flat&logo=gmail&logoColor=white)](mailto:chanukyasharma@gmail.com)
[![LeetCode](https://img.shields.io/badge/LeetCode-FFA116?style=flat&logo=leetcode&logoColor=white)](https://leetcode.com/u/chanukya_gattu/)

---

## About Me

I design and build **production-grade RESTful APIs and event-driven microservices** that power mission-critical financial platforms at scale. My core craft is Java + Spring Boot — designing clean, contract-first APIs with well-defined domain boundaries, reliable failure modes, and the observability to prove it in production.

My systems don't just handle load — they're built to stay consistent under it. From low-latency portfolio APIs serving real-time advisor workflows to Kafka-backed investment event pipelines sustaining ~200 TPS, I care deeply about how services behave at the seams: idempotency, backpressure, retry contracts, and schema evolution.

Currently at **JP Morgan Chase**, I own the backend API layer for a digital wealth-management platform serving 100K+ clients and advisors. Before that, I led REST API modernization and microservices platform work at Capital One (Auto Loans) and AT&T.

```
10+ Years Experience    |    Fortune 100 Financial Platforms    |    Millions of Transactions/Day
```

---

## Technical Stack

**Core Languages**

![Java](https://img.shields.io/badge/Java-ED8B00?style=flat&logo=openjdk&logoColor=white)
![Python](https://img.shields.io/badge/Python-3776AB?style=flat&logo=python&logoColor=white)
![SQL](https://img.shields.io/badge/SQL-4479A1?style=flat&logo=postgresql&logoColor=white)
![Shell](https://img.shields.io/badge/Shell-4EAA25?style=flat&logo=gnubash&logoColor=white)

**Frameworks & Architecture**

![Spring Boot](https://img.shields.io/badge/Spring_Boot-6DB33F?style=flat&logo=spring&logoColor=white)
![Hibernate](https://img.shields.io/badge/Hibernate-59666C?style=flat&logo=hibernate&logoColor=white)
![PySpark](https://img.shields.io/badge/PySpark-E25A1C?style=flat&logo=apachespark&logoColor=white)
![Microservices](https://img.shields.io/badge/Microservices-0078D4?style=flat)

**Messaging & Streaming**

![Apache Kafka](https://img.shields.io/badge/Apache_Kafka-231F20?style=flat&logo=apachekafka&logoColor=white)
![Apache Flink](https://img.shields.io/badge/Apache_Flink-E6526F?style=flat&logo=apacheflink&logoColor=white)
![RabbitMQ](https://img.shields.io/badge/RabbitMQ-FF6600?style=flat&logo=rabbitmq&logoColor=white)
![Redis](https://img.shields.io/badge/Redis-DC382D?style=flat&logo=redis&logoColor=white)

**Cloud & Infrastructure**

![AWS](https://img.shields.io/badge/AWS-232F3E?style=flat&logo=amazonaws&logoColor=white)
![Docker](https://img.shields.io/badge/Docker-2496ED?style=flat&logo=docker&logoColor=white)
![Kubernetes](https://img.shields.io/badge/Kubernetes-326CE5?style=flat&logo=kubernetes&logoColor=white)
![Terraform](https://img.shields.io/badge/Terraform-7B42BC?style=flat&logo=terraform&logoColor=white)

**Databases**

![PostgreSQL](https://img.shields.io/badge/PostgreSQL-336791?style=flat&logo=postgresql&logoColor=white)
![Cassandra](https://img.shields.io/badge/Cassandra-1287B1?style=flat&logo=apachecassandra&logoColor=white)
![Aurora](https://img.shields.io/badge/AWS_Aurora-232F3E?style=flat&logo=amazonaws&logoColor=white)

**Observability & Monitoring**

![Datadog](https://img.shields.io/badge/Datadog-632CA6?style=flat&logo=datadog&logoColor=white)
![Dynatrace](https://img.shields.io/badge/Dynatrace-1496FF?style=flat&logo=dynatrace&logoColor=white)
![Grafana](https://img.shields.io/badge/Grafana-F46800?style=flat&logo=grafana&logoColor=white)
![Prometheus](https://img.shields.io/badge/Prometheus-E6522C?style=flat&logo=prometheus&logoColor=white)
![Splunk](https://img.shields.io/badge/Splunk-000000?style=flat&logo=splunk&logoColor=white)

**CI/CD**

![Jenkins](https://img.shields.io/badge/Jenkins-D24939?style=flat&logo=jenkins&logoColor=white)
![Spinnaker](https://img.shields.io/badge/Spinnaker-139BB4?style=flat&logo=spinnaker&logoColor=white)
![GitHub Actions](https://img.shields.io/badge/GitHub_Actions-2088FF?style=flat&logo=githubactions&logoColor=white)

---

## Career Highlights

### JP Morgan Chase — Senior Software Engineer *(Aug 2022 – Present)*
**Digital Wealth Management Platform · 100K+ Clients & Advisors**

I own the backend API platform powering a digital wealth-management product used by over 100K clients and financial advisors daily. The core engineering challenge was building a REST API layer that could serve real-time portfolio reads at sub-200ms latency while staying consistent with an async Kafka event stream handling investment triggers and goal-state transitions simultaneously — without ever compromising on financial data correctness. The system is decomposed into Spring Boot microservices across portfolio, goals, and investment domains, each with strict versioning, RBAC-enforced access control, and independent deployability backed by Terraform-automated infrastructure on AWS ECS.

---

### AT&T — Senior Software Engineer *(Aug 2021 – Aug 2022)*
**Cloud Modernization · REST API Platform Rebuild**

At AT&T I inherited a monolithic backend that had become a bottleneck — every release touched everything, and scaling one component meant scaling all of them. The challenge was decomposing it into independently deployable Spring Boot microservices with clean REST contracts, while simultaneously migrating the entire platform from on-prem to AWS without disrupting live operations. I led that migration across ECS and Kubernetes, introduced Terraform for infrastructure-as-code, and wired up a full observability stack with Datadog and Grafana — cutting incident detection time significantly and reducing release effort by nearly a third.

---

### Capital One — Senior Software Engineer *(Jan 2020 – Aug 2021)*
**Auto Loans Backend Platform · High-Volume Financial APIs**

At Capital One I worked on the Auto Loans backend — a high-stakes platform where loan origination, servicing, and underwriting APIs need to be not just fast, but provably correct under load and compliant with PCI standards. The hardest problem was building Kafka-backed event pipelines that could process high volumes of payment and underwriting events with strict ordering and delivery guarantees, while the synchronous REST APIs serving partner integrations stayed responsive under peak traffic. I solved the throughput bottleneck using Java Concurrency APIs and multithreading optimizations, and hardened the platform with field-level encryption, tokenization, and RBAC across all API surfaces.

---

### Verizon — Software Engineer *(May 2015 – Jan 2020)*
**OPTIX Ordering Suite · FiOS Order Management**

My foundation in large-scale backend engineering was built at Verizon, where I worked on the OPTIX Ordering Suite supporting FiOS order management and high-volume call center operations. The work centered on Spring Boot API development and integration — modernizing legacy SOAP endpoints into RESTful APIs, optimizing query performance, and introducing caching and async processing to bring order processing latency down meaningfully. It's where I developed the discipline of treating API contracts as first-class concerns and learned what it means to maintain backend systems that thousands of operators depend on every day.

---

## Certifications

| Certification | Issuer |
|---|---|
| AWS Certified Solutions Architect – Associate (SAA-C03) | Amazon Web Services |
| AWS Certified Developer – Associate (DVA-C02) | Amazon Web Services |
| AWS Certified Cloud Practitioner | Amazon Web Services |
| HashiCorp Certified: Terraform Associate (004) | HashiCorp |

---

## Education

**M.S. Electrical Engineering** — State University of New York, New Paltz *(2013–2015)*
Specialized in distributed computing, algorithms, networking, and database management

**B.Tech Electrical Engineering** — Kakatiya University, India *(2009–2013)*

---

## Design Principles I Build By

```
Fail fast, recover faster      —    Design for observable failures over silent ones
Data contracts over code        —    Schema-first API and event design prevents integration debt
Infrastructure is code          —    No snowflake environments; Terraform everything
Measure before optimizing       —    Instrument first, tune what the data confirms is slow
```

---

*Open to Senior SWE roles in distributed systems, platform engineering, and backend infrastructure.*

[![Portfolio](https://img.shields.io/badge/View_Portfolio-000000?style=for-the-badge&logo=githubpages&logoColor=white)](https://chanukyagattu.github.io/portfolio/)
