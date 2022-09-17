# Algorithms &middot; [![Build Status](https://img.shields.io/travis/npm/npm/latest.svg?style=flat-square)](https://travis-ci.org/npm/npm) [![PyPI - Python Version](https://img.shields.io/pypi/pyversions/p)](https://www.python.org/downloads/) [![PRs Welcome](https://img.shields.io/badge/PRs-welcome-brightgreen.svg?style=flat-square)](http://makeapullrequest.com) [![GitHub license](https://img.shields.io/badge/license-MIT-blue.svg?style=flat-square)](https://github.com/apexDev37/Algorithms/blob/master/LICENSE)
> Problem-solving code challenges sourced from HackerRank

<img src="https://cdn1.vectorstock.com/i/thumb-large/20/10/algorithm-outline-blue-icon-on-dark-vector-18592010.jpg" width="15%"></img> <img src="https://play-lh.googleusercontent.com/9zvNJHedNg_6lOdwcodODMVsyeHKxuTIpnbBzomRGGZAp_vKVXnd5SlF8XZcXyGYjQ" width="15%"></img> <img src="https://upload.wikimedia.org/wikipedia/commons/4/40/HackerRank_Icon-1000px.png" width="15%"></img> 


## Introduction
Algorithms is a project that seeks to enable developers to sharpen and enhance their problem-solving skills through the local practice of industry-provided technical questions. These technical programming challenges will be sourced from HackerRank, which I personally use and recommend for a curated experience. Developers may use this project as a base template to work locally, organize, and share their solutions and problem-solving implementations with other developers and interested parties. This repository is for developers of all experience levels to test and practice their problem-solving abilities and thus face problems of the present and the future with a sharper axe utilizing a Test-Driven Development approach.


## Motivation
This project was inspired by a connect session with fellow developers taking Udacity's Full-Stack Developer Nanodegree. Amidst raised concerns about the required competence to succeed at the daunting task of technical interviews in the tech industry, this project was born.

> **Motto**: _One and only one technical question, each day... every day_

## Installing / Getting started

##### Minimal Requirements
You can work with this repo on any host OS: Mac, Linux, or Windows. The only requirement needed will be to have Python installed on your machine. Verify your Python installation by running the following command in a terminal:

```shell
$ # Linux/macOS users
$ python3 --version
> # Windows users
> py --version
```

> The output should be a specific version of a Python installation. If that's not the case, you need to have Python installed. You can follow this gist for installing Python on your target OS [here][Python-Install].

##### Additional Requirements
Though not required to get started working with this repository, it's best practice to work in and develop in a Python virtual environment. However, you can go straight into coding solutions to problem questions locally without creating a virtual environment. In this case, you can jump ahead to the **Setting up Dev** section. Otherwise, follow the instructions below to set up a virtual environment. You can read further official documentation [here][venv], on Python virtual environments.

- Create a virtual environment.
    ```sh
    $ # Navigate to a target dir/folder for the project
    $ cd /your/local/project/dir/
    $ # Create the virtual env
    $ python3 -m venv venv
    ```
- Activate virtual environment.
    ```sh
    $ # Linux/macOS
    $ source venv/bin/activate  
    > # Windows
    > venv\Scripts\activate    
    ```

If you encounter any issues running the above commands, follow the link above to the official Python documentation for installing and setting up a virtual environment.

### Setting up Dev

This section includes details on what a developer must do in order to start developing the project further:

Verify you are on the master branch of the Algorithms repository and Git clone the project.

- Clone the repository
    ```sh
    $ # Using Https
    $ git clone https://github.com/apexDev37/Algorithms.git
    $ # or SSH
    $ git clone git@github.com:apexDev37/Algorithms.git
    ```

After cloning the project `cd` into the Algorithms directory. Once in the root directory of the project, ensure your virtual environment is active and follow the instructions to install the listed packages in the requirements.txt file.

**Note**: This step is optional! The listed packages `autopep8` and `pycodestlye` are used primarily for code formatting and adhering to the PEP8 style guide. More info on PEP8 [here][PEP8]. You can read more on using `autopep8` to format your Python code in the **Style guide** section below.

- cd into the project
    ```sh
    (venv) $ cd Algorithms
    ```
- Install packages in the virtual env
    ```sh
  (venv) $ pip install -r requirements.txt
    ```



## Developing

### Prerequisites
Technical questions for this project will be sourced from HackerRank. If you don't have a HackerRank account, you can get started with one [here][HackerRank]. Alternatively, you can use other popular platforms such as [LeetCode][LeetCode].

### Project Structure
Below is an example of the project structure:

```shell
.
├── easy
|    ├──  question1  
|        ├──  algorithm.txt
|        ├──  main.py
|        ├──  problem.md
|        ├──  solution.py
|        └──  test.py
|    ├──  question2
├──  medium
├──  hard
├──  examples
|    ├──  easy
|         ├──  example1
|        └──  example2
|    ├──  medium
|    └──  hard
├──  template
|    ├──  java
|    ├──  python
|    └──  etc
```

##### Directories
- **easy**: Directory to store technical questions implemented with an easy level.
- **medium**: Directory to store technical questions implemented with a medium level.
- **hard**: Directory to store technical questions implemented with a hard level.
- **examples**: Directory for provided example questions fully implemented of all levels.
- **templates**: Directory providing question templates for different programming languages.

##### Files
- **algorithm.txt**: A text file containing sequential logical steps (pseudocode) to solving a single problem.
- **main.py**: Contains the solution translation and code according to a specific algorithm.
- **problem.md**: Contains the technical question on HackerRank provided in markdown format.
- **solution.py**: Contains the solution code that passes all tests on the HackerRank platform.
- **test.py**: Contains all tests for the solution code in the main.py for a given question.

### Work Flow
Follow this section to get started working on technical coding questions locally.

1. Log in to your HackerRank account and navigate to prepare > algorithms > implementation.
2. Find a problem question that you would like to solve.
3. Create a directory for the problem locally to get started: `cp ./template/<language> ./easy/<question_title> -r`

    ```shell
    $ # Linux/macOS
    $ # Create a dir for the problem 'Find digits' in the easy dir using the Python template
    $ cp ./template/python ./easy/find_digits -r
    ```
    ```shell
    > # Windows
    > # Create a dir for the problem 'Encryption' in the medium dir using the Java template
    > # Right-click on the java dir in .\templates and paste it into the .\medium dir
    ```

    > The above command and steps will create a directory for a given particular technical question.
    Once made `cd` into the directory and begin your implementation.
   
4. Outline your algorithm in pseudocode in the file: `algorithm.txt`
5. Using a TDD approach, design tests for your functions in the file: `test.py`
6. Translate your algorithm solution into code in adherence to written tests in the file: `main.py`
7. After passing all local tests, run your implemented solution on the HackerRank platform.
8. After all tests pass on HackerRank, paste the source code solution in the file: `solution.py`
9. Commit your solution and push it to GitHub to share your solution with other developers.


## Licensing
MIT License: A short and simple permissive license with conditions only requiring preservation of copyright and license notices.

- View and access the MIT License [here][MIT]. 
- Go through the outlined instructions to include the LICENSE in your project.
- Modify the text file and include the YEAR and your FULLNAME.



[//]: # (These are reference links used in the body of this note and get stripped out when the markdown processor does its job. There is no need to format nicely because it shouldn't be seen. Thanks SO - http://stackoverflow.com/questions/4823468/store-comments-in-markdown-syntax)

   [MIT]: <https://choosealicense.com/licenses/mit/#>
   [Python-Install]: <https://gist.github.com/MichaelCurrin/57caae30bd7b0991098e9804a9494c23>
   [venv]: <https://docs.python.org/3/tutorial/venv.html>
   [PEP8]: <https://peps.python.org/pep-0008/>
   [HackerRank]: <https://www.hackerrank.com/>
   [LeetCode]: <https://leetcode.com/>