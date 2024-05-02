import groovy.transform.Field
// This file defines three variables to be used in the AI4OS-Hub Upstream Jenkins pipeline
// base_cpu_tag : base docker image for Dockerfile, CPU version
// base_gpu_tag : base docker image for Dockerfile, GPU version
// dockerfile : what Dockerfile to use for building, can include path, e.g. docker/Dockerfile

@Field
def base_cpu_tag = '1.12.0-py36'

@Field
def base_gpu_tag = '1.12.0-gpu-py36'

@Field
def dockerfile = 'Dockerfile'

return this;
