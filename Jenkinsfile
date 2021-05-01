pipeline{
	agent any 
	stages{
		stage('Uploading library'){
				environment {
					MAVEN_HOME = '/usr/share/maven'
				}
			steps{
					echo 'STARTING DEPLOYING'
				
				rtMavenDeployer (
					id: 'ISP2_P',
					serverId: 'artifactory',
					releaseRepo: 'isp2',
					snapshotRepo: 'isp2',
				)
				rtMavenRun (
					pom: 'pom.xml',
					goals: 'install',
					deployerId: 'isp2'
				)
					echo 'FINING DEPLOYING'
				
			
			}
		}
		stage ('documenting builder artefactory info') {
            steps {
                rtPublishBuildInfo (
                    serverId: "artifactory"
                )
            }
        }
	}
}
