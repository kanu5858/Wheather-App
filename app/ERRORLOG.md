2026-04-20 16:56:29.755  7447-7447  nativeloader            com.kanu.weatherapp                  D  Load libframework-connectivity-tiramisu-jni.so using APEX ns com_android_tethering for caller /apex/com.android.tethering/javalib/framework-connectivity-t.jar: ok
---------------------------- PROCESS STARTED (7447) for package com.kanu.weatherapp ----------------------------
2026-04-20 16:56:34.635  7447-7497  libbinder.Binder        com.kanu.weatherapp                  W  Binder transaction to android.app.IApplicationThread, function: UNKNOWN_FUNCTION_NAME, code: 52, took 2438ms. Data bytes: 152 Reply bytes: 0 Flags: 17
2026-04-20 16:56:35.788  7447-7497  libbinder.Binder        com.kanu.weatherapp                  W  Binder transaction to android.app.IApplicationThread, function: UNKNOWN_FUNCTION_NAME, code: 5, took 1152ms. Data bytes: 6840 Reply bytes: 0 Flags: 17
2026-04-20 16:56:38.542   720-7511  ActivityManager         system_server                        E  ANR in com.google.android.apps.wellbeing
PID: 7409
Reason: Process ProcessRecord{5dcbb15 7409:com.google.android.apps.wellbeing/u0a160} failed to complete startup
ErrorId: 12fe1cc9-a8c8-4196-a33c-fe788f3b6623
Frozen: false
Load: 0.0 / 0.0 / 0.0
----- Output from /proc/pressure/memory -----
some avg10=27.15 avg60=10.05 avg300=3.64 total=16591035
full avg10=23.13 avg60=8.72 avg300=3.12 total=13676680
----- End output from /proc/pressure/memory -----
----- Output from /proc/pressure/cpu -----
some avg10=4.19 avg60=2.56 avg300=4.27 total=52301612
full avg10=0.00 avg60=0.00 avg300=0.00 total=0
----- End output from /proc/pressure/cpu -----
----- Output from /proc/pressure/io -----
some avg10=96.19 avg60=85.85 avg300=68.96 total=448002153
full avg10=81.81 avg60=77.08 avg300=59.87 total=364255116
----- End output from /proc/pressure/io -----

                                                                                                    CPU usage from 2742ms to -2339ms ago (2026-04-20 16:56:33.447 to 2026-04-20 16:56:38.528):
                                                                                                      13% 7444/com.google.android.gms: 8.8% user + 4.5% kernel / faults: 6561 minor 25 major
                                                                                                      12% 461/android.hardware.sensors-service.multihal: 1.3% user + 11% kernel
                                                                                                      10% 720/system_server: 3.5% user + 6.9% kernel / faults: 1942 minor 29 major
                                                                                                      5.1% 493/surfaceflinger: 1.1% user + 3.9% kernel / faults: 10 minor 18 major
                                                                                                      3.9% 6974/com.google.android.gms.persistent: 1.9% user + 1.9% kernel / faults: 2943 minor 3 major
                                                                                                      3.7% 465/android.hardware.graphics.composer3-service.ranchu: 0.1% user + 3.5% kernel
                                                                                                      3.3% 2359/kworker/2:4: 0% user + 3.3% kernel
                                                                                                      3.3% 7447/com.kanu.weatherapp: 1.9% user + 1.3% kernel / faults: 1491 minor 11 major
                                                                                                      3.1% 495/adbd: 0.3% user + 2.7% kernel / faults: 887 minor
                                                                                                      2.5% 4968/com.google.android.apps.nexuslauncher: 0.1% user + 2.3% kernel / faults: 9 minor 33 major
                                                                                                    99% TOTAL: 5.5% user + 10% kernel + 84% iowait
                                                                                                    CPU usage from 579232ms to 579232ms ago (1970-01-01 03:00:00.000 to 1970-01-01 03:00:00.000) with 0% awake:
                                                                                                    0% TOTAL: 0% user + 0% kernel
2026-04-20 16:56:39.061  7447-7447  nativeloader            com.kanu.weatherapp                  D  Configuring clns-9 for other apk /data/app/~~PkUQWgXTSRRyeIiTqYxs6A==/com.kanu.weatherapp-xLbviEvCwg8KTjR6tS91Dg==/base.apk. target_sdk_version=35, uses_libraries=, library_path=/data/app/~~PkUQWgXTSRRyeIiTqYxs6A==/com.kanu.weatherapp-xLbviEvCwg8KTjR6tS91Dg==/lib/x86_64:/data/app/~~PkUQWgXTSRRyeIiTqYxs6A==/com.kanu.weatherapp-xLbviEvCwg8KTjR6tS91Dg==/base.apk!/lib/x86_64, permitted_path=/data:/mnt/expand:/data/user/0/com.kanu.weatherapp
2026-04-20 16:56:39.063  7447-7447  CompatChangeReporter    com.kanu.weatherapp                  D  Compat change id reported: 202956589; UID 10232; state: ENABLED
2026-04-20 16:56:39.346  7447-7447  GraphicsEnvironment     com.kanu.weatherapp                  V  Currently set values for:
2026-04-20 16:56:39.346  7447-7447  GraphicsEnvironment     com.kanu.weatherapp                  V    angle_gl_driver_selection_pkgs=[]
2026-04-20 16:56:39.346  7447-7447  GraphicsEnvironment     com.kanu.weatherapp                  V    angle_gl_driver_selection_values=[]
2026-04-20 16:56:39.346  7447-7447  GraphicsEnvironment     com.kanu.weatherapp                  V  com.kanu.weatherapp is not listed in per-application setting
2026-04-20 16:56:39.346  7447-7447  GraphicsEnvironment     com.kanu.weatherapp                  V  No special selections for ANGLE, returning default driver choice
2026-04-20 16:56:39.349  7447-7447  GraphicsEnvironment     com.kanu.weatherapp                  V  Neither updatable production driver nor prerelease driver is supported.
2026-04-20 16:56:41.819  7447-7593  DisplayManager          com.kanu.weatherapp                  I  Choreographer implicitly registered for the refresh rate.
2026-04-20 16:56:43.026  7447-7447  DesktopExperienceFlags  com.kanu.weatherapp                  D  Toggle override initialized to: false
2026-04-20 16:56:43.767  7447-7593  GFXSTREAM               com.kanu.weatherapp                  I  [eglDisplay.cpp(297)] Opening libGLESv1_CM_emulation.so
2026-04-20 16:56:43.767  7447-7593  GFXSTREAM               com.kanu.weatherapp                  I  [eglDisplay.cpp(297)] Opening libGLESv2_emulation.so
2026-04-20 16:56:43.774  7447-7593  HWUI                    com.kanu.weatherapp                  W  Failed to initialize 101010-2 format, error = EGL_SUCCESS
2026-04-20 16:56:50.335  7447-7447  CompatChangeReporter    com.kanu.weatherapp                  D  Compat change id reported: 309578419; UID 10232; state: ENABLED
2026-04-20 16:56:50.336  7447-7447  DesktopModeFlags        com.kanu.weatherapp                  D  Toggle override initialized to: OVERRIDE_UNSET
2026-04-20 16:56:50.497   720-7636  ActivityManager         system_server                        E  ANR in com.google.android.deskclock
PID: 7514
Reason: Process ProcessRecord{ab41c02 7514:com.google.android.deskclock/u0a174} failed to complete startup
ErrorId: 3c173bf0-7b6e-415d-809b-958b89db3a6d
Frozen: false
Load: 0.0 / 0.0 / 0.0
----- Output from /proc/pressure/memory -----
some avg10=20.99 avg60=12.39 avg300=4.49 total=19723132
full avg10=18.14 avg60=10.73 avg300=3.85 total=16373498
----- End output from /proc/pressure/memory -----
----- Output from /proc/pressure/cpu -----
some avg10=3.05 avg60=2.64 avg300=4.21 total=52837730
full avg10=0.00 avg60=0.00 avg300=0.00 total=0
----- End output from /proc/pressure/cpu -----
----- Output from /proc/pressure/io -----
some avg10=98.10 avg60=88.53 avg300=70.35 total=462028917
full avg10=84.83 avg60=78.76 avg300=61.05 total=376306241
----- End output from /proc/pressure/io -----

                                                                                                    CPU usage from 11731ms to -1ms ago (2026-04-20 16:56:38.528 to 2026-04-20 16:56:50.260):
                                                                                                      12% 461/android.hardware.sensors-service.multihal: 1.2% user + 10% kernel
                                                                                                      9.3% 7447/com.kanu.weatherapp: 5.6% user + 3.7% kernel / faults: 15808 minor 73 major
                                                                                                      7.6% 720/system_server: 4% user + 3.5% kernel / faults: 12481 minor 412 major
                                                                                                      2.8% 465/android.hardware.graphics.composer3-service.ranchu: 0.1% user + 2.7% kernel / faults: 1 minor 15 major
                                                                                                      2.2% 493/surfaceflinger: 0.4% user + 1.7% kernel / faults: 61 minor 27 major
                                                                                                      1.7% 495/adbd: 0.2% user + 1.4% kernel / faults: 660 minor
                                                                                                      1.4% 1016/com.android.systemui: 0.3% user + 1.1% kernel / faults: 531 minor 81 major
                                                                                                      1.3% 7444/com.google.android.gms: 0.6% user + 0.6% kernel / faults: 2796 minor 6 major
                                                                                                      1.2% 2359/kworker/2:4: 0% user + 1.2% kernel
                                                                                                      1.1% 7577/android.process.acore: 0.5% user + 0.6% kernel / faults: 2048 minor 84 major
                                                                                                    99% TOTAL: 3.4% user + 6.6% kernel + 89% iowait + 0% softirq
                                                                                                    CPU usage from 593302ms to 593302ms ago (1970-01-01 03:00:00.000 to 1970-01-01 03:00:00.000) with 0% awake:
                                                                                                    0% TOTAL: 0% user + 0% kernel
2026-04-20 16:56:50.539   720-7636  ActivityManager         system_server                        E  ANR in com.google.android.apps.photos
PID: 7515
Reason: Process ProcessRecord{5b7d36f 7515:com.google.android.apps.photos/u0a172} failed to complete startup
ErrorId: 3e95d193-32ed-4977-8ec0-639679834079
Frozen: false
Load: 0.0 / 0.0 / 0.0
----- Output from /proc/pressure/memory -----
some avg10=20.99 avg60=12.39 avg300=4.49 total=19748389
full avg10=18.14 avg60=10.73 avg300=3.85 total=16382776
----- End output from /proc/pressure/memory -----
----- Output from /proc/pressure/cpu -----
some avg10=3.05 avg60=2.64 avg300=4.21 total=52875628
full avg10=0.00 avg60=0.00 avg300=0.00 total=0
----- End output from /proc/pressure/cpu -----
----- Output from /proc/pressure/io -----
some avg10=98.10 avg60=88.53 avg300=70.35 total=462206294
full avg10=84.83 avg60=78.76 avg300=61.05 total=376390519
----- End output from /proc/pressure/io -----

                                                                                                    CPU usage from 11981ms to 249ms ago (2026-04-20 16:56:38.528 to 2026-04-20 16:56:50.260):
                                                                                                      12% 461/android.hardware.sensors-service.multihal: 1.2% user + 10% kernel
                                                                                                      9.3% 7447/com.kanu.weatherapp: 5.6% user + 3.7% kernel / faults: 15808 minor 73 major
                                                                                                      7.6% 720/system_server: 4% user + 3.5% kernel / faults: 12481 minor 412 major
                                                                                                      2.8% 465/android.hardware.graphics.composer3-service.ranchu: 0.1% user + 2.7% kernel / faults: 1 minor 15 major
                                                                                                      2.2% 493/surfaceflinger: 0.4% user + 1.7% kernel / faults: 61 minor 27 major
                                                                                                      1.7% 495/adbd: 0.2% user + 1.4% kernel / faults: 660 minor
                                                                                                      1.4% 1016/com.android.systemui: 0.3% user + 1.1% kernel / faults: 531 minor 81 major
                                                                                                      1.3% 7444/com.google.android.gms: 0.6% user + 0.6% kernel / faults: 2796 minor 6 major
                                                                                                      1.2% 2359/kworker/2:4: 0% user + 1.2% kernel
                                                                                                      1.1% 7577/android.process.acore: 0.5% user + 0.6% kernel / faults: 2048 minor 84 major
                                                                                                    99% TOTAL: 3.4% user + 6.6% kernel + 89% iowait + 0% softirq
                                                                                                    CPU usage from 593552ms to 593552ms ago (1970-01-01 03:00:00.000 to 1970-01-01 03:00:00.000) with 0% awake:
                                                                                                    0% TOTAL: 0% user + 0% kernel
2026-04-20 16:56:51.207  7447-7447  CompatChangeReporter    com.kanu.weatherapp                  D  Compat change id reported: 349153669; UID 10232; state: ENABLED
2026-04-20 16:56:51.216  7447-7447  HWUI                    com.kanu.weatherapp                  W  Unknown dataspace 0
2026-04-20 16:56:51.343  7447-7659  ProfileInstaller        com.kanu.weatherapp                  D  Installing profile for com.kanu.weatherapp
2026-04-20 16:56:51.407  7447-7491  kanu.weatherapp         com.kanu.weatherapp                  I  Compiler allocated 5247KB to compile void android.view.ViewRootImpl.performTraversals(long)
2026-04-20 16:56:52.875  7447-7447  VRI[MainActivity]       com.kanu.weatherapp                  D  WindowInsets changed: 1080x2424 statusBars:[0,142,0,0] navigationBars:[0,0,0,63] mandatorySystemGestures:[0,174,0,84]
2026-04-20 16:56:52.876  7447-7447  WindowOnBackDispatcher  com.kanu.weatherapp                  D  setTopOnBackInvokedCallback (unwrapped): android.view.ViewRootImpl$$ExternalSyntheticLambda13@2abb525
2026-04-20 16:56:52.898  7447-7447  Surface                 com.kanu.weatherapp                  I  Creating surface for consumer unnamed-7447-0 with slotExpansion=1 for 64 slots
2026-04-20 16:56:52.900  7447-7447  Surface                 com.kanu.weatherapp                  I  Creating surface for consumer VRI[MainActivity]#0(BLAST Consumer)0 with slotExpansion=1 for 64 slots
2026-04-20 16:56:53.163  7447-7496  HWUI                    com.kanu.weatherapp                  I  Davey! duration=1915ms; Flags=1, FrameTimelineVsyncId=20065, IntendedVsync=594285060802, Vsync=594385060798, InputEventId=0, HandleInputStart=594388854700, AnimationStart=594388880000, PerformTraversalsStart=594388913600, DrawStart=596127842900, FrameDeadline=594301727468, FrameStartTime=594388421900, FrameInterval=16666666, WorkloadTarget=16666666, SyncQueued=596133574200, SyncStart=596134035000, IssueDrawCommandsStart=596134144300, SwapBuffers=596135430700, FrameCompleted=596201237800, DequeueBufferDuration=32700, QueueBufferDuration=2016000, GpuCompleted=596201082500, SwapBuffersCompleted=596201237800, DisplayPresentTime=0, CommandSubmissionCompleted=596135430700,
2026-04-20 16:56:53.171  7447-7447  Choreographer           com.kanu.weatherapp                  I  Skipped 99 frames!  The application may be doing too much work on its main thread.
2026-04-20 16:56:53.212  7447-7447  InsetsController        com.kanu.weatherapp                  D  hide(ime())
2026-04-20 16:56:53.212  7447-7447  ImeTracker              com.kanu.weatherapp                  I  com.kanu.weatherapp:7d28c1f3: onCancelled at PHASE_CLIENT_ALREADY_HIDDEN
2026-04-20 16:56:53.548  7447-7675  HWUI                    com.kanu.weatherapp                  I  Using FreeType backend (prop=Auto)
2026-04-20 16:57:03.187  7447-7758  okhttp.OkHttpClient     com.kanu.weatherapp                  I  --> GET https://api.open-meteo.com/v1/forecast?hourly=temperature_2m,weathercode,relativehumidity_2m,windspeed_10m,pressure_msl&latitude=51.5074&longitude=-0.1278
2026-04-20 16:57:03.187  7447-7758  okhttp.OkHttpClient     com.kanu.weatherapp                  I  --> END GET
2026-04-20 16:57:03.288  7447-7447  InsetsController        com.kanu.weatherapp                  D  hide(ime())
2026-04-20 16:57:03.288  7447-7447  ImeTracker              com.kanu.weatherapp                  I  com.kanu.weatherapp:1aa77ccf: onCancelled at PHASE_CLIENT_ALREADY_HIDDEN
2026-04-20 16:57:05.834  7447-7758  okhttp.OkHttpClient     com.kanu.weatherapp                  I  <-- 200 OK https://api.open-meteo.com/v1/forecast?hourly=temperature_2m,weathercode,relativehumidity_2m,windspeed_10m,pressure_msl&latitude=51.5074&longitude=-0.1278 (2646ms)
2026-04-20 16:57:05.834  7447-7758  okhttp.OkHttpClient     com.kanu.weatherapp                  I  Date: Mon, 20 Apr 2026 13:57:04 GMT
2026-04-20 16:57:05.834  7447-7758  okhttp.OkHttpClient     com.kanu.weatherapp                  I  Content-Type: application/json; charset=utf-8
2026-04-20 16:57:05.834  7447-7758  okhttp.OkHttpClient     com.kanu.weatherapp                  I  Transfer-Encoding: chunked
2026-04-20 16:57:05.834  7447-7758  okhttp.OkHttpClient     com.kanu.weatherapp                  I  Connection: keep-alive
2026-04-20 16:57:05.837  7447-7758  okhttp.OkHttpClient     com.kanu.weatherapp                  I  {"latitude":51.51147,"longitude":-0.13078308,"generationtime_ms":0.25284290313720703,"utc_offset_seconds":0,"timezone":"GMT","timezone_abbreviation":"GMT","elevation":16.0,"hourly_units":{"time":"iso8601","temperature_2m":"°C","weathercode":"wmo code","relativehumidity_2m":"%","windspeed_10m":"km/h","pressure_msl":"hPa"},"hourly":{"time":["2026-04-20T00:00","2026-04-20T01:00","2026-04-20T02:00","2026-04-20T03:00","2026-04-20T04:00","2026-04-20T05:00","2026-04-20T06:00","2026-04-20T07:00","2026-04-20T08:00","2026-04-20T09:00","2026-04-20T10:00","2026-04-20T11:00","2026-04-20T12:00","2026-04-20T13:00","2026-04-20T14:00","2026-04-20T15:00","2026-04-20T16:00","2026-04-20T17:00","2026-04-20T18:00","2026-04-20T19:00","2026-04-20T20:00","2026-04-20T21:00","2026-04-20T22:00","2026-04-20T23:00","2026-04-21T00:00","2026-04-21T01:00","2026-04-21T02:00","2026-04-21T03:00","2026-04-21T04:00","2026-04-21T05:00","2026-04-21T06:00","2026-04-21T07:00","2026-04-21T08:00","2026-04-21T09:00","2026-04-21T10:00","2026-04-21T11:00","2026-04-21T12:00","2026-04-21T13:00","2026-04-21T14:00","2026-04-21T15:00","2026-04-21T16:00","2026-04-21T17:00","2026-04-21T18:00","2026-04-21T19:00","2026-04-21T20:00","2026-04-21T21:00","2026-04-21T22:00","2026-04-21T23:00","2026-04-22T00:00","2026-04-22T01:00","2026-04-22T02:00","2026-04-22T03:00","2026-04-22T04:00","2026-04-22T05:00","2026-04-22T06:00","2026-04-22T07:00","2026-04-22T08:00","2026-04-22T09:00","2026-04-22T10:00","2026-04-22T11:00","2026-04-22T12:00","2026-04-22T13:00","2026-04-22T14:00","2026-04-22T15:00","2026-04-22T16:00","2026-04-22T17:00","2026-04-22T18:00","2026-04-22T19:00","2026-04-22T20:00","2026-04-22T21:00","2026-04-22T22:00","2026-04-22T23:00","2026-04-23T00:00","2026-04-23T01:00","2026-04-23T02:00","2026-04-23T03:00","2026-04-23T04:00","2026-04-23T05:00","2026-04-23T06:00","2026-04-23T07:00","2026-04-23T08:00","2026-04-23T09:00","2026-04-23T10:00","2026-04-23T11:00","2026-04-23T12:00","2026-04-23T13:00","2026-04-23T14:00","2026-04-23T15:00","2026-04-23T16:00","2026-04-23T17:00","2026-04-23T18:00","2026-04-23T19:00","2026-04-23T20:00","2026-04-23T21:00","2026-04-23T22:00","2026-04-23T23:00","2026-04-24T00:00","2026-04-24T01:00","2026-04-24T02:00","2026-04-24T03:00","2026-04-24T04:00","2026-04-24T05:00","2026-04-24T06:00","2026-04-24T07:00","2026-04-24T08:00","2026-04-24T09:00","2026-04-24T10:00","2026-04-24T11:00","2026-04-24T12:00","2026-04-24T13:00","2026-04-24T14:00","2026-04-24T15:00","2026-04-24T16:00","2026-04-24T17:00","2026-04-24T18:00","2026-04-24T19:00","2026-04-24T20:00","2026-04-24T21:00","2026-04-24T22:00","2026-04-24T23:00","2026-04-25T00:00","2026-04-25T01:00","2026-04-25T02:00","2026-04-25T03:00","2026-04-25T04:00","2026-04-25T05:00","2026-04-25T06:00","2026-04-25T07:00","2026-04-25T08:00","2026-04-25T09:00","2026-04-25T10:00","2026-04-25T11:00","2026-04-25T12:00","2026-04-25T13:00","2026-04-25T14:00","2026-04-25T15:00","2026-04-25T16:00","2026-04-25T17:00","2026-04-25T18:00","2026-04-25T19:00","2026-04-25T20:00","2026-04-25T21:00","2026-04-25T22:00","2026-04-25T23:00","2026-04-26T00:00","2026-04-26T01:00","2026-04-26T02:00","2026-04-26T03:00","2026-04-26T04:00","2026-04-26T05:00","2026-04-26T06:00","2026-04-26T07:00","2026-04-26T08:00","2026-04-26T09:00","2026-04-26T10:00","2026-04-26T11:00","2026-04-26T12:00","2026-04-26T13:00","2026-04-26T14:00","2026-04-26T15:00","2026-04-26T16:00","2026-04-26T17:00","2026-04-26T18:00","2026-04-26T19:00","2026-04-26T20:00","2026-04-26T21:00","2026-04-26T22:00","2026-04-26T23:00"],"temperature_2m":[9.1,8.7,7.9,7.9,7.5,7.3,6.9,7.7,9.3,10.2,11.4,12.4,12.7,13.1,13.3,12.7,12.6,12.1,12.2,11.2,10.1,9.6,9.1,8.6,8.3,8.2,8.0,8.0,8.0,7.8,7.6,8.1,9.2,10.4,11.8,13.4,13.8,14.2,14.5,14.5,14.2,13.4,12.2,11.1,10.0,8.9,8.3,7.8,7.6,7.4,7.2,7.1,7.0,7.0,7.3,8.3,10.3,12.5,13.9,14.9,15.7,15.6,15.2,14.7,14.0,13.6,13.3,12.3,11.5,10.8,10.2,9.7,9.2,8.7,8.3,8.0,7.7,7.5,7.7,8.7,10.2,11.7,13.2,14.7,15.8,16.4,16.7,16.7,16.5,16.1,15.4,14.4,13.2,12.0,10.9,9.8,8.8,7.8,6.
2026-04-20 16:57:05.838  7447-7758  okhttp.OkHttpClient     com.kanu.weatherapp                  I  9,6.2,5.8,5.6,5.6,5.9,6.4,7.2,8.7,10.6,12.3,13.8,15.3,16.1,16.2,15.7,14.9,13.7,12.2,10.8,9.9,9.1,8.5,7.9,7.4,7.0,6.6,6.2,6.2,6.8,7.8,8.9,10.2,11.5,12.6,13.1,13.2,13.2,13.3,13.2,12.8,11.9,10.7,9.8,10.4,9.8,9.4,9.1,8.9,8.8,8.7,8.8,9.1,9.7,10.5,11.4,12.4,13.4,14.1,14.8,15.4,15.9,16.3,16.6,16.8,16.8,16.6,16.2,15.8,15.5],"weathercode":[2,2,0,0,0,0,0,1,2,2,2,2,2,3,3,51,3,3,2,1,2,1,3,3,0,3,2,2,3,1,0,1,0,0,1,2,2,2,2,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,3,3,3,3,3,3,3,3,3,2,1,0,0,1,1,0,0,0,0,0,0,0,0,0,1,2,2,2,1,0,0,0,0,0,1,2,2,3,3,3,3,3,2,1,0,0,0,0,1,2,2,2,1,1,0,0,0,1,1,2,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3],"relativehumidity_2m":[72,74,74,77,80,83,85,78,62,53,46,44,44,44,42,54,50,54,51,58,65,66,70,71,77,77,79,79,78,78,75,63,52,51,46,45,47,44,41,39,38,33,40,45,49,58,63,67,70,73,76,79,81,81,80,76,69,51,39,32,29,28,30,32,35,39,41,45,48,52,58,66,73,78,83,86,89,91,90,86,80,72,62,51,42,38,37,36,35,34,35,36,38,43,52,64,74,79,82,85,88,91,91,89,84,79,72,64,57,51,46,43,42,42,45,52,61,69,74,78,81,84,85,87,89,91,91,88,84,79,73,67,62,61,61,61,59,57,58,64,73,79,74,78,81,83,85,87,88,88,88,86,83,80,76,72,70,68,67,67,66,66,66,66,67,68,69,69],"windspeed_10m":[6.8,7.6,3.6,4.7,4.7,5.8,6.5,9.0,9.4,7.9,11.2,11.9,11.9,11.9,10.4,8.3,14.0,10.4,10.8,16.6,14.8,14.8,11.9,14.8,14.8,14.0,13.7,13.0,14.8,14.4,15.5,16.6,16.9,15.8,15.8,19.1,20.5,19.4,18.4,17.6,18.4,19.4,19.4,18.7,16.6,16.2,15.5,14.8,14.0,13.7,12.6,13.0,13.3,14.0,15.1,16.2,17.6,17.6,19.1,21.2,20.2,21.8,23.0,23.2,22.3,20.5,19.1,19.1,16.9,14.8,13.7,13.0,12.2,11.9,11.5,11.2,10.4,9.7,9.7,10.4,11.9,13.0,13.7,14.8,15.1,15.5,15.5,15.1,14.8,14.0,13.3,13.0,12.6,12.6,12.6,12.2,12.2,11.9,11.5,11.2,11.2,10.8,10.8,10.4,9.7,9.4,9.0,8.6,8.6,9.4,10.8,11.9,12.6,13.3,13.7,13.3,12.6,11.9,11.5,11.5,11.2,10.8,10.4,10.1,10.1,10.4,10.8,10.8,10.4,10.4,10.8,11.5,12.2,12.2,12.2,12.2,12.2,12.2,12.6,13.0,13.7,13.7,9.7,9.0,8.6,8.6,8.6,9.0,9.4,9.7,9.4,8.6,7.6,6.5,5.0,4.0,3.2,2.9,2.5,2.2,2.2,2.5,2.9,4.0,5.0,6.8,8.3,9.7],"pressure_msl":[1025.3,1024.9,1024.5,1024.4,1024.4,1024.3,1024.5,1024.8,1024.8,1024.9,1024.4,1024.4,1024.4,1024.0,1023.9,1023.8,1023.9,1023.9,1023.8,1024.2,1024.7,1025.0,1025.3,1025.6,1025.6,1025.5,1025.3,1025.3,1025.2,1025.3,1025.4,1025.5,1025.6,1025.8,1025.7,1025.3,1025.4,1025.7,1025.5,1025.6,1025.8,1025.8,1025.7,1026.1,1026.5,1026.7,1026.6,1026.4,1026.2,1025.9,1025.8,1025.6,1025.6,1025.8,1025.9,1025.9,1026.0,1026.0,1025.9,1025.6,1025.5,1025.3,1024.9,1024.7,1024.6,1024.7,1024.7,1023.5,1024.1,1024.5,1024.7,1024.7,1024.7,1024.6,1024.6,1024.6,1024.9,1025.3,1025.7,1026.0,1026.2,1026.4,1026.5,1026.5,1026.5,1026.3,1026.0,1025.8,1025.7,1025.7,1025.7,1025.8,1026.0,1026.1,1026.1,1026.1,1026.0,1025.8,1025.5,1025.3,1025.3,1025.3,1025.4,1025.4,1025.5,1025.4,1025.2,1024.9,1024.5,1024.0,1023.5,1023.0,1022.7,1022.4,1022.3,1022.4,1022.7,1022.9,1023.1,1023.3,1023.3,1023.0,1022.6,1022.3,1022.3,1022.3,1022.4,1022.4,1022.4,1022.3,1022.1,1021.9,1021.6,1021.3,1021.0,1020.7,1020.5,1020.4,1020.3,1020.3,1020.3,1020.2,1019.9,1019.8,1019.7,1019.5,1019.3,1019.1,1018.9,1018.7,1018.5,1018.4,1018.2,1018.1,1018.0,1017.9,1017.8,1017.6,1017.4,1017.2,1017.0,1016.8,1016.7,1016.7,1016.8,1016.9,1017.0,1017.1]}}
2026-04-20 16:57:05.838  7447-7758  okhttp.OkHttpClient     com.kanu.weatherapp                  I  <-- END HTTP (7207-byte body)
2026-04-20 16:57:09.683  7447-7447  Choreographer           com.kanu.weatherapp                  I  Skipped 194 frames!  The application may be doing too much work on its main thread.
2026-04-20 16:57:10.462  7447-7496  HWUI                    com.kanu.weatherapp                  I  Davey! duration=4492ms; Flags=0, FrameTimelineVsyncId=22699, IntendedVsync=608985060214, Vsync=609451726862, InputEventId=0, HandleInputStart=609469598900, AnimationStart=609469624100, PerformTraversalsStart=609918117700, DrawStart=609918193700, FrameDeadline=609051726878, FrameStartTime=609469351200, FrameInterval=16666666, WorkloadTarget=16666666, SyncQueued=612724788000, SyncStart=612724953900, IssueDrawCommandsStart=612725051500, SwapBuffers=613407661400, FrameCompleted=613477587900, DequeueBufferDuration=30600, QueueBufferDuration=244400, GpuCompleted=613477587900, SwapBuffersCompleted=613469201900, DisplayPresentTime=0, CommandSubmissionCompleted=613407661400,
2026-04-20 16:57:10.479  7447-7496  HWUI                    com.kanu.weatherapp                  I  Davey! duration=3292ms; Flags=0, FrameTimelineVsyncId=22715, IntendedVsync=609485060194, Vsync=612718393398, InputEventId=0, HandleInputStart=612726978900, AnimationStart=612727003900, PerformTraversalsStart=612727035400, DrawStart=612727109200, FrameDeadline=613501726700, FrameStartTime=612726673700, FrameInterval=16666666, WorkloadTarget=16666666, SyncQueued=612727458500, SyncStart=613469352900, IssueDrawCommandsStart=613469459000, SwapBuffers=613470967300, FrameCompleted=613519836700, DequeueBufferDuration=28046800, QueueBufferDuration=253000, GpuCompleted=613519836700, SwapBuffersCompleted=613505769100, DisplayPresentTime=0, CommandSubmissionCompleted=613470967300,
2026-04-20 16:59:59.687  7447-7447  InsetsController        com.kanu.weatherapp                  D  hide(ime())
2026-04-20 16:59:59.688  7447-7447  ImeTracker              com.kanu.weatherapp                  I  com.kanu.weatherapp:d1a3d6d9: onCancelled at PHASE_CLIENT_ALREADY_HIDDEN
