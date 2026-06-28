# CS-320-13318-M01-Software-Test-Automation-QA-2026
portfolio repository containing my contact service files and Project Two reflection report, demonstrating unit testing, software quality assurance, and requirements-based testing with JUnit.


This repository includes selected artifacts from CS 320. From Project One, I included the contact service files: Contact.java, ContactService.java, ContactTest.java, and ContactServiceTest.java. From Project Two, I included my summary and reflections report. Together, these artifacts show my work with software testing, automation, and quality assurance.

## How can I ensure that my code, program, or software is functional and secure?

I can ensure that my code is functional and secure by testing it against the requirements and checking both valid and invalid inputs. In Project One, I used JUnit tests to make sure the contact service handled correct data, rejected invalid data, and followed rules such as field length limits, required fields, unique IDs, and a 10-digit phone number. Testing helped me confirm that the program worked as expected before submission.

Security also depends on preventing bad or unexpected data from being accepted. For example, rejecting null values, overly long fields, and invalid phone numbers helps protect the program from errors and unreliable data. I also learned that passing tests does not mean software is perfect, so it is important to keep reviewing, testing, and improving code as requirements change.

## How do I interpret user needs and incorporate them into a program?

I interpret user needs by turning requirements into specific features, rules, and tests. For the contact service, the user needed a way to add, update, and delete contacts while making sure each contact had valid information. I used those needs to guide the design of the Contact and ContactService classes.

The requirements became a checklist for development and testing. For example, because the contact ID could not be longer than 10 characters and could not be null, I wrote code and tests to enforce that rule. This helped me make sure the final program matched what the user asked for instead of only what I assumed they needed.

## How do I approach designing software?

I approach software design by breaking the problem into smaller parts and keeping each class focused on its responsibility. In Project One, the Contact class handled the contact data and validation rules, while the ContactService class handled adding, updating, and deleting contacts. This made the code easier to understand, test, and maintain.

I also design software with testing in mind. Writing JUnit tests helped me think about edge cases early, such as duplicate IDs, missing values, and invalid phone numbers. In the future, I will continue using requirements, unit tests, and clear class responsibilities to create software that is easier to update and less likely to develop technical debt.
